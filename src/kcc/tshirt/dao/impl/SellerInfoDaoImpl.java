
package kcc.tshirt.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import kcc.tshirt.connection.DatabaseConnection;
import kcc.tshirt.dao.SellerInfoDao;
import kcc.tshirt.model.SellInfo;

/**
 *
 * @author personal
 */
public class SellerInfoDaoImpl implements SellerInfoDao {

    private String SelectQuery = "select sell_info_id, sell_info_buyer_name, sell_info_address, sell_info_contact1, sell_info_contact2, sell_info_contact3, sell_info_size, "
            + "sell_info_wrist_band_count, sell_info_cap_count, sell_info_payment_method, sell_info_delivery_status from sell_info";

    @Override
    public boolean AddSellerInfo(SellInfo SellInfo) throws SQLException {
        Connection Con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = Con.prepareStatement("insert into sell_info (sell_info_buyer_name, sell_info_address, sell_info_contact1,"
                + " sell_info_contact2, sell_info_contact3, sell_info_size, sell_info_wrist_band_count, sell_info_cap_count,"
                + " sell_info_payment_method, sell_info_delivery_status) values (?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1, SellInfo.getBuyerName());
        ps.setString(2, SellInfo.getAddress());
        ps.setString(3, SellInfo.getContact1());
        ps.setString(4, SellInfo.getContact2());
        ps.setString(5, SellInfo.getContact3());
        ps.setString(6, SellInfo.getSize());
        ps.setInt(7, SellInfo.getWristBandCount());
        ps.setInt(8, SellInfo.getCapCount());
        ps.setString(9, SellInfo.getPaymentMethod());
        ps.setString(10, SellInfo.getDeliveryStatus());
        ps.executeUpdate();
        ps.close();
        return true;
    }

    @Override
    public boolean UpdateSellerInfo(SellInfo SellInfo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean DeleteSellerInfo(int SellerInfoId) throws SQLException {
        Connection Con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = Con.prepareStatement("delete from sell_info where sell_info_id=?");
        ps.setInt(1, SellerInfoId);
        ps.executeUpdate();
        ps.close();
        return true;
    }

    @Override
    public ResultSet GetSellerInfoByOneAttribute(String Attribute, String Condition, String Value) throws SQLException {
        return new commonDaoImpl().getResultByAttribute(SelectQuery, Attribute, Condition, Value);
    }

    @Override
    public ResultSet GetAllSellerInfo() throws SQLException {
        return new commonDaoImpl().getAllRecords(SelectQuery);
    }

    @Override
    public ResultSet GetSellerInfoByMoreAttributes(ArrayList<String[]> AttributeConditionValueList, String Operator) throws SQLException {
       return new commonDaoImpl().getResultByAttributesWithJoinOperator(SelectQuery, AttributeConditionValueList, Operator);
    }

}
