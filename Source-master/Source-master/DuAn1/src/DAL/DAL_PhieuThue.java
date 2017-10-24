/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.*;
import DAL.*;
import GUI.*;
//mport BLL.*;
import DTO.DTO_Quyen;
import GUI.DuAn1;
import java.sql.ResultSet;
/**
 *
 * @author Administrator
 */
public class DAL_PhieuThue {
     public static ResultSet GetAll() {
        String query = "Select * from PhieuThue";
        return DuAn1.conn.ExcuteQuerySelect(query);
    }
     
}