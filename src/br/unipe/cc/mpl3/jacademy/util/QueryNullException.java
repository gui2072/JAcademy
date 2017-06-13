/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.mpl3.jacademy.util;

import java.sql.ResultSet;

/**
 *
 * @author Nitai Charan
 */
public class QueryNullException extends Exception {

    public QueryNullException() {
    }

    public QueryNullException(String message) {
        super(message);
    }

    public QueryNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public QueryNullException(Throwable cause) {
        super(cause);
    }

    public QueryNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public QueryNullException(ResultSet resultSet) throws QueryNullException{
        if(resultSet==null){
            throw new QueryNullException("Querry não retornou valor!!!");
        }
    }

    @Override
    public String toString() {
        return "Null Query";
    }

}
