package service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Enumeration;
import java.util.Hashtable;
import util.DataBaseException;
import util.JDBConnection;

public class AllServices {

	public static List getadlist() throws DataBaseException,SQLException{	
		  
         String sql="select * from ADTABLE";
     	 List list=JDBConnection.getList(sql);
 		return list;
}
	
	public static List getpreferredadlist(String[] hobbies) throws DataBaseException,SQLException{	
		List TotalList=null; 
		for(int i=0;i<hobbies.length;i++)
		  {
			  String sql="select * from ADTABLE Where RECEIVERS like '%"+hobbies[i]+"%'"; 
		    	 List list=JDBConnection.getList(sql);
		    	 TotalList.add(list);
		  }
		return TotalList;
    }
	
	 
	
	public static void transaction(String userid,String adid, String username, String userpic) throws DataBaseException, SQLException{
		    int id=0;
			String sql="select count(*) from TRANSACTIONTABLE";
			ResultSet rs=JDBConnection.getResultSet(sql);
			rs.next();
			
			int size=rs.getInt(1);
			if(size==0)
				 id=1;
			else
	          {
				 sql="select MAX(TRANSID) from TRANSACTIONTABLE";
		 		 rs=JDBConnection.getResultSet(sql);
		 		 rs.next();
		 		 id=rs.getInt(1)+1;
	          }
			String date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
			sql="insert into TRANSACTIONTABLE values("+String.valueOf(id)+",'"+adid+"','"+date+"','"+userid+"','"+username+"','"+userpic+"')";
			JDBConnection.executeUpdate(sql);
			
			 sql="select * from ADTABLE where ADID="+Integer.parseInt(adid);
			  rs=JDBConnection.getResultSet(sql);
			 rs.next();
			 int hits=Integer.parseInt(rs.getString("HITS"))+1;
			 int price=Integer.parseInt(rs.getString("UNITPRICE"));
			 int revenue=hits*price;
		         sql="update ADTABLE set HITS='"+""+hits+"',REVENUE='"+""+revenue+"'  where ADID="+Integer.parseInt(adid);
		         JDBConnection.executeUpdate(sql);
		}
	
	
	public static boolean isUserNotExist(String email) throws DataBaseException, SQLException
	{
		int size=0;
		String sql="select count(*) from USERTABLE where Email= '"+email+"'"; 
		ResultSet rs=JDBConnection.getResultSet(sql);
		rs.next();
 		 size=rs.getInt(1);
		if(size==0){
			return true;
		}
		return false;	
	}
		
	public static String login(String fname, String lname, String password) throws DataBaseException, SQLException
	{
		int size=0;
		String sql="select count(*) from USERTABLE where PASSWORD= '"+password+"' and LASTNAME= '"+lname+"' and FIRSTNAME= '"+fname+"'"; 
		ResultSet rs=JDBConnection.getResultSet(sql);
		rs.next();
		 size=rs.getInt(1);
		if(size==0){
			return "";
		}
		else
		{
			 sql="select * from USERTABLE where PASSWORD= '"+password+"' and LASTNAME= '"+lname+"' and FIRSTNAME= '"+fname+"'"; 
			 rs=JDBConnection.getResultSet(sql);
			rs.next();
			String uid=rs.getString("USERID");
			System.out.println(uid);
			return uid;
		}	
	}
	
	public static int AddUser(String fname,String lname, String password,String email) throws DataBaseException, SQLException{
	    int id=0;
		String sql="select MAX(USERID) from USERTABLE";
 		ResultSet rs=JDBConnection.getResultSet(sql);
 		rs.next();
 		
 		int size=rs.getInt(1);
 		System.out.println(size);
 		//if(size==1)
 		//	 id=1;
 		//else
              id=size+1;

 		String datetime=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
 		sql="insert into USERTABLE values("+String.valueOf(id)+",'"
		+password+"','"+lname+"','"+fname+"','"+" "+"', '"
		+" "+"', '"+" "+"','"+" "+"','"+email+"','"
		+"male"+"','"+"1000-01-01"+"','"+" "+"','"+datetime+"','"+"/FriendFace/jsp/images/default.jpg"+"')";
 		JDBConnection.executeUpdate(sql);
	    
 		sql="insert into CIRCLETABLE values("+"1"+",'"+"friend"+"','"+ id+"')";
	    System.out.println(sql);
 		JDBConnection.executeUpdate(sql);
 		
	    return id;
	}
	
	public static ResultSet getProfile(String userid) throws DataBaseException,SQLException{
		 String sql="select * from USERTABLE where USERID="+Integer.parseInt(userid);
		 ResultSet rs=JDBConnection.getResultSet(sql);
		 rs.next();
		 return rs;
	}
	
public static void SaveProfile(String userid, String profilepic,String sex,String birthday,
		String preference,String state, String city,String zipcode, String email,String  phone) throws DataBaseException, SQLException{
		
	String sql="";
	if(profilepic.equals(""))
		{
			 sql="update USERTABLE set SEX='"+sex+"', BIRTHDAY='"
			+birthday+"', PREFERENCE='"+preference+"', STATE='"+state+"', CITY='"
			+city+"', ZIPCODE='"+zipcode+"', EMAIL='"+email+"', TELEPHONE='"+phone+"' where USERID="+Integer.parseInt(userid);
	
		}
		else
		{
			sql="update USERTABLE set SEX='"+sex+"', BIRTHDAY='"
			+birthday+"', PREFERENCE='"+preference+"', STATE='"+state+"', CITY='"
			+city+"', ZIPCODE='"+zipcode+"', EMAIL='"+email+"', TELEPHONE='"+phone+"', PROFILEPIC='"+profilepic+"' where USERID="+Integer.parseInt(userid);
	    
		}
		JDBConnection.executeUpdate(sql);
	}
     
     public static List requestList(String receiverid) throws DataBaseException,SQLException{	
 		
 		String sql="select * from REQUESTTABLE where RECEIVERID="+receiverid;
 		List list=JDBConnection.getList(sql);
 		return list;
 	}

     public static List friendList(String userid) throws DataBaseException,SQLException{	
    	 List<Map> list = new ArrayList<Map>();
 	    
    	 String sql="select * from FRIENDTABLE where USERID="+userid;
    	 Hashtable<Integer, String> table=new Hashtable<Integer, String>();
     	ResultSet rs=JDBConnection.getResultSet(sql);
     	while(rs.next())   { 
     		table.put(rs.getInt("FRIENDID"),"true"); 
     	} 
     	Enumeration e=table.keys();
    	while(e.hasMoreElements())
    	{
    		int id=Integer.parseInt(e.nextElement().toString());
    	    sql= "select * from USERTABLE where USERID="+id;
			rs = JDBConnection.getResultSet(sql);
			Map<String, String> map;
			rs.next();
				map = new HashMap<String, String>();
				map.put("userId", rs.getString(1));
				map.put("firstName", rs.getString(4));
				map.put("lastName", rs.getString(3));
				map.put("profilePic", rs.getString(14));
				list.add(map);
    	}
  		return list;
  	}
     
        public static List showsuggestFriendList(String userid) throws DataBaseException, SQLException{
	    List<Map> list = new ArrayList<Map>();
	    
	    Hashtable<Integer, String> table=new Hashtable<Integer, String>();
	    String sql="select USERID from USERTABLE";
    	ResultSet rs=JDBConnection.getResultSet(sql);
    	while(rs.next())   
    	{  
    		table.put(rs.getInt(1),"true"); 
    	} 
    	//remove self
    	if(table.containsKey(Integer.parseInt(userid)))
   		 table.remove(Integer.parseInt(userid));
    	
    	 sql="select FRIENDID from FRIENDTABLE where USERID= "+Integer.parseInt(userid);
    	 rs=JDBConnection.getResultSet(sql);
    	 
    	while(rs.next())   
    	{  
    		if(table.containsKey(rs.getInt("FRIENDID")))
    			table.remove(rs.getInt("FRIENDID"));
    	} 
    	
    	Enumeration e=table.keys();
    	while(e.hasMoreElements())
    	{
    		int id=Integer.parseInt(e.nextElement().toString());
    	    sql= "select * from USERTABLE where USERID="+id;
			rs = JDBConnection.getResultSet(sql);
			Map<String, String> map;
			rs.next();
				map = new HashMap<String, String>();
				map.put("userId", rs.getString(1));
				map.put("firstName", rs.getString(4));
				map.put("lastName", rs.getString(3));
				map.put("profilePic", rs.getString(14));
				list.add(map);
    	}
		 
		return list;
}
    
    public static void AddRequest(String senderid,String sendername, String receiverid) throws DataBaseException, SQLException{
	    
    	System.out.println("rid:"+receiverid);
    	int id=0;
		String sql="select count(*) from REQUESTTABLE";
 		ResultSet rs=JDBConnection.getResultSet(sql);
 		rs.next();
 		
 		int size=rs.getInt(1);
 		if(size==0)
 			 id=1;
 		else
              {
 			 sql="select MAX(RID) from REQUESTTABLE";
 	 		 rs=JDBConnection.getResultSet(sql);
 	 		 rs.next();
 	 		 id=rs.getInt(1)+1;
              }
 		
 		sql="insert into REQUESTTABLE values("+String.valueOf(id)+",'"+senderid+"','"+sendername+"',"+Integer.parseInt(receiverid)+")";
 		System.out.println(sql);
 		JDBConnection.executeUpdate(sql);
	}
	
    public static void AddFriend(String rid,String flag) throws DataBaseException, SQLException{
	    
    	String sql="select * from REQUESTTABLE where RID="+Integer.parseInt(rid);
 		ResultSet rs=JDBConnection.getResultSet(sql);
 		rs.next();
 		String senderid=rs.getString("SENDERID");
 		String receiverid=rs.getString("RECEIVERID");
    	
 		//delete
 		sql="delete from REQUESTTABLE where SENDERID= '"+Integer.parseInt(senderid)+"' and RECEIVERID='"+Integer.parseInt(receiverid)+"'";   
 		JDBConnection.executeUpdate(sql);
 		
 		sql="delete from REQUESTTABLE where RECEIVERID='"+Integer.parseInt(senderid)+"' and SENDERID='"+Integer.parseInt(receiverid)+"'";   
 		JDBConnection.executeUpdate(sql);
 		
 		//if it is confirm 
 		if(flag.equals("1"))
 		{
 			 sql="select * from USERTABLE where USERID="+Integer.parseInt(senderid);
 	 		 rs=JDBConnection.getResultSet(sql);
 	 		rs.next();
 	 		String sfirstname=rs.getString("FIRSTNAME");
 	 		String slastname =rs.getString("LASTNAME");
 	 		
 	 		 sql="select * from USERTABLE where USERID="+Integer.parseInt(receiverid);
 	 		 rs=JDBConnection.getResultSet(sql);
 	 		rs.next();
 	 		String Rfirstname=rs.getString("FIRSTNAME");
 	 		String Rlastname =rs.getString("LASTNAME");
 			
 	 		int id=0;
 			 sql="select count(*) from FRIENDTABLE";
 	 		 rs=JDBConnection.getResultSet(sql);
 	 		 rs.next();
 	 		 int size=rs.getInt(1);
 	 		if(size==0)
 	 			 id=1;
 	 		else
 	              {
 	 			 sql="select MAX(FID) from FRIENDTABLE";
 	 	 		 rs=JDBConnection.getResultSet(sql);
 	 	 		 rs.next();
 	 	 		 id=rs.getInt(1)+1;
 	              }
 	 		sql="insert into FRIENDTABLE values("+String.valueOf(id)+",'"
 			+senderid+"','"+receiverid+"','"+Rfirstname+"','"+Rlastname+"','"+"1"+"','"+"friend"+"')";
 	 		JDBConnection.executeUpdate(sql);
 	 		id++;
 	 		sql="insert into FRIENDTABLE values("+String.valueOf(id)+",'"
 			+receiverid+"','"+senderid+"','"+sfirstname+"','"+slastname+"','"+"1"+"','"+"friend"+"')";
 	 		JDBConnection.executeUpdate(sql);
 		}
	}
    
  public static ResultSet getFriendList(String userid) throws DataBaseException,SQLException{	
 		
 		String sql="select * from FRIENDTABLE where USERID="+userid;
 		ResultSet rs=JDBConnection.getResultSet(sql);
 		return rs;
 	}
    
  public static ResultSet getUserId(String fname, String lname) throws DataBaseException,SQLException{
		 String sql="select USERID from USERTABLE where FIRSTNAME= '"+fname+"' and LASTNAME='"+lname+"'"; 
		 ResultSet rs=JDBConnection.getResultSet(sql);
		 rs.next();
		 return rs;
	}
  
  //add subject
  public static void AddSubject(String starter, String substitle, String receivers) throws DataBaseException, SQLException{
	    int id=0;
		String sql="select count(*) from SUBJECTTABLE";
		ResultSet rs=JDBConnection.getResultSet(sql);
		rs.next();
		
		int size=rs.getInt(1);
		if(size==0)
			 id=1;
		else
            {
			 sql="select MAX(SUBID) from SUBJECTTABLE";
	 		 rs=JDBConnection.getResultSet(sql);
	 		 rs.next();
	 		 id=rs.getInt(1)+1;
            }
		String datetime=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
		sql="insert into SUBJECTTABLE values("+String.valueOf(id)+",'"+starter+"','"+substitle+"','"+receivers+"','"+datetime+"')";
		JDBConnection.executeUpdate(sql);
	}
  
  public static List persubjectList(String userid, String name) throws DataBaseException,SQLException{	
		
		String sql="select * from SUBJECTTABLE where STARTER='"+name+"' or RECEIVERS like '%"+userid+"%'"; 
		List list=JDBConnection.getList(sql);
		return list;
	}
  
  public static List messageList(String subid) throws DataBaseException,SQLException{	
		
		String sql="select * from MASSAGETABLE where SUBID='"+subid+"'"; 
		List list=JDBConnection.getList(sql);
		return list;
	}
  
  public static void AddMessage(String sid, String sname, String subid, String content) throws DataBaseException, SQLException{
	    int id=0;
		String sql="select count(*) from MASSAGETABLE";
		ResultSet rs=JDBConnection.getResultSet(sql);
		rs.next();
		
		int size=rs.getInt(1);
		if(size==0)
			 id=1;
		else
          {
			 sql="select MAX(MID) from MASSAGETABLE";
	 		 rs=JDBConnection.getResultSet(sql);
	 		 rs.next();
	 		 id=rs.getInt(1)+1;
          }
		String datetime=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
		sql="insert into MASSAGETABLE values("+String.valueOf(id)+",'"+sid+"','"+sname+"','"+subid+"','"+content+"','"+datetime+"')";
		JDBConnection.executeUpdate(sql);
	}
  
  //circle
  public static List circleList(String userid) throws DataBaseException,SQLException{	
		
		String sql="select * from CIRCLETABLE where OWNERID='"+userid+"'"; 
		List list=JDBConnection.getList(sql);
		return list;
	}
  
  public static void AddCircle(String cname, String userid) throws DataBaseException, SQLException{
	    int id=0;
		String sql="select count(*) from CIRCLETABLE where OWNERID="+userid;
		ResultSet rs=JDBConnection.getResultSet(sql);
		rs.next();
		
		int size=rs.getInt(1);
		if(size==0)
			 id=1;
		else
        {
			 sql="select MAX(CID) from CIRCLETABLE where OWNERID="+userid;
	 		 rs=JDBConnection.getResultSet(sql);
	 		 rs.next();
	 		 id=rs.getInt(1)+1;
        }
		sql="insert into CIRCLETABLE values("+String.valueOf(id)+",'"+cname+"','"+userid+"')";
		JDBConnection.executeUpdate(sql);
	}
  
  public static void deleteCircle(String cid, String userid) throws DataBaseException, SQLException{
	  if(!cid.equals("1"))
	  {
		  String sql="update FRIENDTABLE set CID='1', CNAME='friend' where USERID="+Integer.parseInt(userid)+" AND CID="+Integer.parseInt(cid);
	      System.out.println(sql); 
	      JDBConnection.executeUpdate(sql); 
	      
	      //delete circle
	       sql="delete CIRCLETABLE where CID="+Integer.parseInt(cid);
	      JDBConnection.executeUpdate(sql); 	  
	  }    
  }
  
	  public static List circlefriendList(String userid, String cid) throws DataBaseException,SQLException{	
			
			String sql="select * from FRIENDTABLE where USERID='"+userid+"' and CID='"+cid+"'"; 
			List list=JDBConnection.getList(sql);
			return list;
	}
	  
	  public static ResultSet getcircleList(String userid) throws DataBaseException,SQLException{	
	 		
	 		String sql="select * from CIRCLETABLE where OWNERID="+userid;
	 		ResultSet rs=JDBConnection.getResultSet(sql);
	 		return rs;
	 	}
	  
	  public static String getCID(String userid, String fname, String lname) throws DataBaseException,SQLException{	
	 		
	 		String sql="select * from FRIENDTABLE where USERID='"+userid+"' and FFIRSTNAME='"+fname+"' and FLASTNAME='"+lname+"'";
	 		ResultSet rs=JDBConnection.getResultSet(sql);
	 		rs.next();
	 		String cid=rs.getString("CID");
	 		return cid;
	 	}
	  
	  public static void ChangeCircle(String userid, String ocid, String cname, String fname,String lname) throws DataBaseException,SQLException{	
	 		
	 		String sql="select * from CIRCLETABLE where OWNERID='"+userid+"' and CID='"+ocid+"'";
	 		ResultSet rs=JDBConnection.getResultSet(sql);
	 		rs.next();
	 		String oldname=rs.getString("CNAME");
	 		oldname=oldname.trim();
	 		cname=cname.trim();
	 		
	 		if(!oldname.equals(cname))    //the circle name indeed been changed
	 		{
	 			 sql="select * from CIRCLETABLE where OWNERID='"+userid+"' and CNAME='"+cname+"'";
		 		 rs=JDBConnection.getResultSet(sql);
		 		 rs.next();
		 		 String newcid=rs.getString("CID");
		 		 
		 		 //update
		 		 sql="update FRIENDTABLE set CID="+newcid+", CNAME='"
			+cname+"' where USERID="+Integer.parseInt(userid)+" AND FFIRSTNAME='"+fname+"' AND FLASTNAME='"+lname+"'";
			     
			      JDBConnection.executeUpdate(sql); 
	 		}
	 	}
	  
	  //post
	  public static void AddPost(String userid, String username, String userpic, String postpic, String ptitle) throws DataBaseException, SQLException{
		    int id=0;
			String sql="select count(*) from TABLEPOST";
			ResultSet rs=JDBConnection.getResultSet(sql);
			rs.next();
			
			int size=rs.getInt(1);
			if(size==0)
				 id=1;
			else
	          {
				 sql="select MAX(PID) from TABLEPOST";
		 		 rs=JDBConnection.getResultSet(sql);
		 		 rs.next();
		 		 id=rs.getInt(1)+1;
	          }
			String datetime=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
//			PID,PTITLE,POSTERID,POSTERNAME,POSTERPIC,POSTPIC,DATE
			sql="insert into TABLEPOST values("
				+String.valueOf(id)+",'"+ptitle+"','"+userid+"','"+username+"','"+userpic+"','"+postpic+"','"+datetime+"')";
			JDBConnection.executeUpdate(sql);
		}
	  
	  
	  //get all posts from friends and self in tiem order
	  public static List getPostList(String userid) throws DataBaseException,SQLException{	
		  List<Map> list = new ArrayList<Map>();
		    
		    Hashtable<String, String> table=new Hashtable<String, String>();
		    String sql="select * from FRIENDTABLE WHERE USERID="+Integer.parseInt(userid);
	    	ResultSet rs=JDBConnection.getResultSet(sql);
	    	while(rs.next())   
	    	{  
	    		table.put(rs.getString("FRIENDID"),"true"); 
	    	} 
	    	//add self
	    	table.put(userid,"true"); 
	    	
	    	 sql="select * from TABLEPOST";
	    	 rs=JDBConnection.getResultSet(sql);
	    	while(rs.next())   
	    	{  
	    		if(table.containsKey(rs.getString("POSTERID")))
	    		{
	    		Map<String, String> map = new HashMap<String, String>();
	    		map.put("pid", rs.getString(1));
				map.put("ptitle", rs.getString(2));
				map.put("postername", rs.getString(4));
				map.put("posterpic", rs.getString(5));
				map.put("postpic", rs.getString(6));
				map.put("date", rs.getString(7));
				list.add(map);	
	    		}		
	    	} 
	    	 
			return list;
		}
	  
	  public static List getCommentList(String pid) throws DataBaseException,SQLException{	
			
			String sql="select * from TABLECOMMENT where PID='"+Integer.parseInt(pid)+"' order by DATE"; 
			List list=JDBConnection.getList(sql);
			return list;
	}
	  
	  public static void AddComment(String userid, String username, String pid, String content) throws DataBaseException, SQLException{
		    int id=0;
			String sql="select count(*) from TABLECOMMENT";
			ResultSet rs=JDBConnection.getResultSet(sql);
			rs.next();
			
			int size=rs.getInt(1);
			if(size==0)
				 id=1;
			else
	          {
				 sql="select MAX(CMID) from TABLECOMMENT";
		 		 rs=JDBConnection.getResultSet(sql);
		 		 rs.next();
		 		 id=rs.getInt(1)+1;
	          }
			String date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
			sql="insert into TABLECOMMENT values("
				+String.valueOf(id)+",'"+userid+"','"+username+"','"+date+"','"+content+"','"+pid+"')";
			JDBConnection.executeUpdate(sql);
		}
	  
	  //sip
	  public static List SIPList(String userid) throws DataBaseException,SQLException{	
			
			String sql="select * from SIPTABLE where CREATERID='"+userid+"' or SHARERS like '%"+userid+"%'"; 
			List list=JDBConnection.getList(sql);
			return list;
		}
	  
	  public static int AddSIP(String sipname,String userid, String descript,String sippic) throws DataBaseException, SQLException{
		    int id=0;
			String sql="select count(*) from SIPTABLE";
			ResultSet rs=JDBConnection.getResultSet(sql);
			rs.next();
			
			int size=rs.getInt(1);
			if(size==0)
				 id=1;
			else
	          {
				 sql="select MAX(SIPID) from SIPTABLE";
		 		 rs=JDBConnection.getResultSet(sql);
		 		 rs.next();
		 		 id=rs.getInt(1)+1;
	          }
			String datetime=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
			//String sippic ,String sharers
			sql="insert into SIPTABLE values("
				+String.valueOf(id)+",'"+sipname+"','"+userid+"','"+descript+"','"+sippic+"','"+" "+"','"+datetime+"')";
			JDBConnection.executeUpdate(sql);
			return id;
		}
	  
	  public static void AddSIPRequest(int sipid,String sipname,String username, String rid) throws DataBaseException, SQLException{
		    int id=0;
			String sql="select count(*) from SIPREQUESTTABLE";
			ResultSet rs=JDBConnection.getResultSet(sql);
			rs.next();
			
			int size=rs.getInt(1);
			if(size==0)
				 id=1;
			else
	          {
				 sql="select MAX(SRID) from SIPREQUESTTABLE";
		 		 rs=JDBConnection.getResultSet(sql);
		 		 rs.next();
		 		 id=rs.getInt(1)+1;
	          }
			//String sippic ,String sharers
			sql="insert into SIPREQUESTTABLE values("
				+String.valueOf(id)+",'"+sipid+"','"+sipname+"','"+username+"','"+rid+"')";
			JDBConnection.executeUpdate(sql);
		}
	  
	  public static List siprequestList(String receiverid) throws DataBaseException,SQLException{	
	 		
	 		String sql="select * from SIPREQUESTTABLE where RECEIVERID="+receiverid;
	 		List list=JDBConnection.getList(sql);
	 		return list;
	 	}
			 
	  public static void AddSIP(String userid,String srid,String sipflag)throws DataBaseException, SQLException
	  {
		  String sql="select * from SIPREQUESTTABLE where SRID="+Integer.parseInt(srid);
	 		ResultSet rs=JDBConnection.getResultSet(sql);
	 		rs.next();
	 		String sipid=rs.getString("SIPID");
	 		
	 		//delete
	 		sql="delete from SIPREQUESTTABLE where SRID= '"+Integer.parseInt(srid)+"'";   
	 		JDBConnection.executeUpdate(sql);
	 		
	 		if(sipflag.equals("1"))  //request confirmed
	 		{
	 			 sql="select * from SIPTABLE where SIPID="+Integer.parseInt(sipid);
		 		 rs=JDBConnection.getResultSet(sql);
		 		rs.next();
		 		String sharers=rs.getString("SHARERS");
		 		sharers=sharers+","+userid;
		 		
		 		sql="update SIPTABLE set SHARERS='"+sharers+"' where SIPID="+Integer.parseInt(sipid);
	 		    JDBConnection.executeUpdate(sql); 
	 		}  
	  }
	  
	  public static ResultSet getSIPInfo(String sipid) throws DataBaseException,SQLException{
			 String sql="select * from SIPTABLE where SIPID="+Integer.parseInt(sipid);
			 ResultSet rs=JDBConnection.getResultSet(sql);
			 rs.next();
			 return rs;
		}
	  
	  public static List SIPPostList(String sipid) throws DataBaseException,SQLException{
			 String sql="select * from SIPPOSTTABLE where SIPID="+Integer.parseInt(sipid);
			 List list=JDBConnection.getList(sql);
		 		return list;
		}
	  
	  public static void AddSIPPost(String sipptitle,String userid,String username, String userpic,String sippostpic,String sipid) throws DataBaseException, SQLException{
		    int id=0;
			String sql="select count(*) from SIPPOSTTABLE";
			ResultSet rs=JDBConnection.getResultSet(sql);
			rs.next();
			
			int size=rs.getInt(1);
			if(size==0)
				 id=1;
			else
	          {
				 sql="select MAX(SIPPID) from SIPPOSTTABLE";
		 		 rs=JDBConnection.getResultSet(sql);
		 		 rs.next();
		 		 id=rs.getInt(1)+1;
	          }
			String datetime=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
			sql="insert into SIPPOSTTABLE values("
				+String.valueOf(id)+",'"+sipptitle+"','"+userid+"','"+username+"','"+userpic+"','"+sippostpic+"','"+datetime+"','"+sipid+"')";
			JDBConnection.executeUpdate(sql);
		}
	  
	  public static List getSIPCommentList(String sippid) throws DataBaseException,SQLException{	
			
			String sql="select * from SIPCOMMENTTABLE where SIPPID='"+Integer.parseInt(sippid)+"' order by SIPCMDATE"; 
			List list=JDBConnection.getList(sql);
			return list;
	}
	  
	  public static void AddSIPPComment(String userid, String username,  String content,String sippid) throws DataBaseException, SQLException{
		    int id=0;
			String sql="select count(*) from SIPCOMMENTTABLE";
			ResultSet rs=JDBConnection.getResultSet(sql);
			rs.next();
			
			int size=rs.getInt(1);
			if(size==0)
				 id=1;
			else
	          {
				 sql="select MAX(SIPCMID) from SIPCOMMENTTABLE";
		 		 rs=JDBConnection.getResultSet(sql);
		 		 rs.next();
		 		 id=rs.getInt(1)+1;
	          }
			String date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
			sql="insert into SIPCOMMENTTABLE values("
				+String.valueOf(id)+",'"+userid+"','"+username+"','"+date+"','"+content+"','"+sippid+"')";
			JDBConnection.executeUpdate(sql);
		}
	  //
	  
	  //**********advertisement part
	  
	  public static boolean isManagerNotExist(String mname, String company) throws DataBaseException, SQLException
		{
			int size=0;
			String sql="select count(*) from MANAGERTABLE where MNAME= '"+mname+"' AND COMPANY='"+company+"'"; 
			ResultSet rs=JDBConnection.getResultSet(sql);
			rs.next();
	 		 size=rs.getInt(1);
			if(size==0){
				return true;
			}
			return false;	
		}
			
		public static String adlogin(String mname,String password) throws DataBaseException, SQLException
		{   int size=0;
			String sql="select count(*) from MANAGERTABLE where MNAME= '"+mname+"' AND PASSWORD='"+password+"'"; 
			ResultSet rs=JDBConnection.getResultSet(sql);
			rs.next();
	 		 size=rs.getInt(1);
			if(size==0){
				return "";
			}
			else
			{
				 sql="select * from MANAGERTABLE where MNAME= '"+mname+"' AND PASSWORD='"+password+"'"; 
				 rs=JDBConnection.getResultSet(sql);
				rs.next();
				String inc=rs.getString("COMPANY");
				System.out.println(inc);
				return inc;
			}	
		}
		
		public static void Addcompany(String mname,String company,String password) throws DataBaseException, SQLException{
		    int id=0;
			String sql="select MAX(MANAGERID) from MANAGERTABLE";
	 		ResultSet rs=JDBConnection.getResultSet(sql);
	 		rs.next();
	 		int size=rs.getInt(1);
	              id=size+1;

	 		sql="insert into MANAGERTABLE values("+String.valueOf(id)+",'"+mname+"','"+company+"','"+password+"')";
	 		JDBConnection.executeUpdate(sql);
		}
	  
		  public static List ADList(String company) throws DataBaseException,SQLException{
				 String sql="select * from ADTABLE where COMPANY='"+company+"'";
				 List list=JDBConnection.getList(sql);
			 		return list;
			}
		  
		  public static void AdCreate(String itemname,String adpic,String inc,String price,String keywords) throws DataBaseException, SQLException{
			    int id=0;
				String sql="select count(*) from ADTABLE";
				ResultSet rs=JDBConnection.getResultSet(sql);
				rs.next();
				
				int size=rs.getInt(1);
				if(size==0)
					 id=1;
				else
		          {
					 sql="select MAX(ADID) from ADTABLE";
			 		 rs=JDBConnection.getResultSet(sql);
			 		 rs.next();
			 		 id=rs.getInt(1)+1;
		          }
				String date=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
				sql="insert into ADTABLE values("
					+String.valueOf(id)+",'"+itemname+"','"+adpic+"','"+inc+"','"+price+"','"+"0"+"','"+keywords+"','"+date+"','"+"0"+"')";
				JDBConnection.executeUpdate(sql);
			}
	  
		  public static void DeleteAd(String adid) throws DataBaseException, SQLException{
			 
			    String sql="delete from TRANSACTIONTABLE where ADID= '"+Integer.parseInt(adid)+"'";   
		 		JDBConnection.executeUpdate(sql);
		 		sql="delete from ADTABLE where ADID='"+Integer.parseInt(adid)+"'";   
		 		JDBConnection.executeUpdate(sql);  
		  }
		  
		  public static List salesList(String inc) throws DataBaseException,SQLException{	
			  
			  String sql="select * from ADTABLE where COMPANY='"+inc+"' Order By ADATE";
				 List list=JDBConnection.getList(sql);
			 		return list;
			}
		  
		  public static int gettotalrenvue(String inc) throws DataBaseException,SQLException{	
			    int sum=0;
			   String sql="select * from ADTABLE WHERE COMPANY='"+inc+"'";
		    	ResultSet rs=JDBConnection.getResultSet(sql);
		    	while(rs.next())   
		    	{  
		    		int revenue=Integer.parseInt(rs.getString(9).trim());
		    			sum=sum+revenue;
		    	} 
				return sum;
			}
//	  

		  public static List salesListbyhits(String inc) throws DataBaseException,SQLException{	
			  
			  String sql="select * from ADTABLE where COMPANY='"+inc+"' Order By HITS";
				 List list=JDBConnection.getList(sql);
			 		return list;
			}


		  public static List salesListbyrevenue(String inc) throws DataBaseException,SQLException{	
	  
	        String sql="select * from ADTABLE where COMPANY='"+inc+"' Order By REVENUE";
	     	 List list=JDBConnection.getList(sql);
	 		return list;
	}
		  
		  public static List getcustomerlist(String adid) throws DataBaseException,SQLException{	
			  
		        String sql="select * from TRANSACTIONTABLE where ADID='"+adid+"' Order By TDATE";
		     	 List list=JDBConnection.getList(sql);
		 		return list;
		}
		  
		  public static List getbestcustomer(String adid) throws DataBaseException,SQLException{	
			  Hashtable<String, Integer> table=new Hashtable<String, Integer>();
			    String sql="select * from TRANSACTIONTABLE WHERE ADID="+Integer.parseInt(adid);
		    	ResultSet rs=JDBConnection.getResultSet(sql);
		    	while(rs.next())   
		    	{  
		    		if(table.containsKey(rs.getString("USERID")))
		    		{
		    			int hits=table.get(rs.getString("USERID"));
		    			hits=hits+1;
		    			table.put(rs.getString("USERID"),hits); 
		    		}
		    		else
		    		table.put(rs.getString("USERID"),1); 
		    	} 
		    	int max=0;
		    	String userid="";
		    	Enumeration e=table.keys();
		    	while(e.hasMoreElements())
		    	{
		    		String tempuser=e.nextElement().toString();
		    		int temp=table.get(tempuser);
		    		if(temp>max)
		    		{
		    			max=temp;
		    			userid=tempuser;
		    		}    
		    	}	
		    	List<Map> list = new ArrayList<Map>();
		    	 sql="select * from USERTABLE where USERID='"+userid+"'";
		    	  rs=JDBConnection.getResultSet(sql);
		     	 Map<String, String> map;
					rs.next();
						map = new HashMap<String, String>();
						map.put("bestcustomer", rs.getString(4)+" "+rs.getString(3));
						map.put("bestcustomerpic", rs.getString(14));
						list.add(map);
		 		return list;
		  }
}
