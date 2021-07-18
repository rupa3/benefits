package com.sbi.benefits.datasource;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.DefaultAwsRegionProviderChain;
import com.amazonaws.services.rds.auth.GetIamAuthTokenRequest;
import com.amazonaws.services.rds.auth.RdsIamAuthTokenGenerator;
import org.postgresql.ds.PGSimpleDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;


public class AWSIAMDatasource extends PGSimpleDataSource
{
    private final static long serialVersionUID = 1L;

    @Override
    public Connection getConnection(String user, String password)
    throws SQLException
    {
        setProperty("ssl", "true");
        setProperty("sslmode", "require");

        RdsIamAuthTokenGenerator generator = RdsIamAuthTokenGenerator.builder()
                .credentials(new DefaultAWSCredentialsProviderChain())
                .region("us-east-1")
                .build();

        String authToken = generator.getAuthToken(
                GetIamAuthTokenRequest.builder()
                        .hostname("benefits.cbs3jdi20ptu.us-east-1.rds.amazonaws.com")
                        .port(5432)
                        .userName("iam_db_user")
                        .build());

        System.out.println("Token For IAM User : " + authToken);

        return super.getConnection(user, authToken);
    }
}
