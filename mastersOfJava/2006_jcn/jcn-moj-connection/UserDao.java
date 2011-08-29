/*------------------------------------------------------------------------------
 *     Ident: Delivery Center Java
 *    Author: berkmope
 * Copyright: (c) 8-jul-2006 Sogeti Nederland B.V. All Rights Reserved.
 *------------------------------------------------------------------------------
 * Sogeti Nederland B.V.    |  No part of this file may be reproduced or 
 * Divisie Managed Delivery |  transmitted in any form or by any means,        
 * Lange Dreef 17           |  electronic or mechanical, for the purpose,      
 * 4131 NJ VIANEN           |  without the express written permission of the   
 * The Netherlands          |  copyright holder.
 *------------------------------------------------------------------------------
 */

import java.util.Collection;
import java.util.HashSet;

/**
 * UserDao reads a user object from the database.
 *
 * @version	$Id:$
 * @author		berkmope (c) 8-jul-2006, Sogeti B.V.
 */
public class UserDao
{
    private static final String QUERY = "Get UserId, PassWord, Name, LoginCount from Users";
    private DataSource dataSource;

    /**
     * Constructor: create a new UserDao.
     *
     */
    public UserDao()
    {
        super();
    }
    
    /**
     * Set the dataSource to the specified value.
     *
     * @param dataSource The dataSource to set.
     */
    public void setDataSource(DataSource dataSource)
    {
        this.dataSource = dataSource;
    }

    /**
     * Get the dataSource.
     *
     * @return Returns the dataSource as a DataSource.
     */
    public DataSource getDataSource()
    {
        return this.dataSource;
    }

    /**
     * Get all users from the data store. Returns an empty collection
     * if no users were found.
     * 
     * @return the collection of users.
     * @throws DatabaseException if a connection cannot be created
     * (dataSource returns null), or if a ConnectionException occurs.
     */
    public Collection<User> getAll()
    {
//        Connection connection = this.dataSource.getConnection();
//        connection.open();
//        Statement statement = connection.createStatement(QUERY);
//        Collection<User> users = processResults(statement.execute());
//        statement.closeStatement();
//        connection.close();

        return null;
    }
    
    /**
     * Process the resultset.
     * 
     * @param resultSet
     * @return the collection of users
     * @throws ConnectionException
     */
    private Collection<User> processResults(ResultSet resultSet) throws ConnectionException
    {
        Collection<User> result = new HashSet<User>();
        
        while (resultSet.hasNext())
        {
            resultSet.next();
            
            User user = new User();
            
            user.setUserId(resultSet.getInt(1));
            user.setPassWord(resultSet.getObject(2));
            user.setName(resultSet.getString(3));
            user.setLoginCount(resultSet.getInt(4));
            
            result.add(user);
        }
        
        return result;
    }
}
