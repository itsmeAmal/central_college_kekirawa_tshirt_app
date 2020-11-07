/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kcc.tshirt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import kcc.tshirt.model.SellInfo;

/**
 *
 * @author personal
 */
public interface SellerInfoDao {
    
    boolean AddSellerInfo(SellInfo SellInfo)throws SQLException;
    
    boolean UpdateSellerInfo(SellInfo SellInfo)throws SQLException;
 
    boolean DeleteSellerInfo(int SellerInfoId)throws SQLException;

    ResultSet GetSellerInfoByOneAttribute(String Attribute, String Condition, String Value)throws SQLException;
    
    ResultSet GetAllSellerInfo()throws SQLException;
    
    ResultSet GetSellerInfoByMoreAttributes(ArrayList<String[]> AttributeConditionValueList, String Condition)throws SQLException;

}

