package datab;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import moodul.Item;

public class Dao extends AbstractDao {
   
   public boolean deleteAll() throws SQLException {
      try {
         st = getConnection().createStatement();
         rs = st.executeQuery("DELETE FROM unit");
      }
      finally {
         closeResources();
      }
      return true;
   }
   
   public boolean deleteItem(int id) throws SQLException {
      try {
         st = getConnection().createStatement();
         rs = st.executeQuery("DELETE FROM unit WHERE id = " + id);
      }
      finally {
         closeResources();
      }
      return true;
   }
   
   public boolean addItem(String name, String code) throws SQLException {
      try {
         st = getConnection().createStatement();
         rs = st.executeQuery("INSERT INTO unit VALUES (NEXT VALUE FOR seq1), '" + name + "', '" + code + "'");
      }
      finally {
         closeResources();
      }
      return true;
   }
   
   public List<Item> search(String keyword) throws SQLException{
      List<Item> resItems = new ArrayList<Item>();
      try {
         st = getConnection().createStatement();
         rs = st.executeQuery("SELECT * FROM unit WHERE LCASE(name) LIKE '%" + keyword.toLowerCase() + "%'");
         
         while(rs.next()) {
            Item OneItem = new Item();
            
            OneItem.setId(rs.getInt("id"));
            OneItem.setName(rs.getString("name"));
            OneItem.setCode(rs.getString("code"));
            
            resItems.add(OneItem);
         }
      }
      finally {
         closeResources();
      }
      return resItems;
   }
   
   
   
   public List<Item> findAllItems() throws SQLException {
      List<Item> allitems = new ArrayList<Item>();
      try {
         st = getConnection().createStatement();
         rs = st.executeQuery("SELECT * FROM unit");
        
         while(rs.next()) {
            Item oneItem = new Item();
            
            oneItem.setId(Integer.parseInt(rs.getString("id")));
            oneItem.setName(rs.getString("name"));
            oneItem.setCode(rs.getString("code"));
            
            allitems.add(oneItem);            
         }
      } 
      finally {
         closeResources();
      }
      return allitems;
   }

}