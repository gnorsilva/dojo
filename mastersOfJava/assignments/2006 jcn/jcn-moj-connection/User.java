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

/**
 * User domain object.
 *
 * @version	$Id:$
 * @author		berkmope (c) 8-jul-2006, Sogeti B.V.
 */
public class User
{
    private int userId;
    private Object passWord;
    private String name;
    private int loginCount;

    /**
     * Constructor: create a new User.
     *
     */
    public User()
    {
        super();
    }

    /**
     * Get the loginCount.
     *
     * @return Returns the loginCount as a int.
     */
    public int getLoginCount()
    {
        return this.loginCount;
    }

    /**
     * Set the loginCount to the specified value.
     *
     * @param loginCount The loginCount to set.
     */
    public void setLoginCount(int loginCount)
    {
        this.loginCount = loginCount;
    }

    /**
     * Get the name.
     *
     * @return Returns the name as a String.
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Set the name to the specified value.
     *
     * @param name The name to set.
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Get the passWord.
     *
     * @return Returns the passWord as a Object.
     */
    public Object getPassWord()
    {
        return this.passWord;
    }

    /**
     * Set the passWord to the specified value.
     *
     * @param passWord The passWord to set.
     */
    public void setPassWord(Object passWord)
    {
        this.passWord = passWord;
    }

    /**
     * Get the userId.
     *
     * @return Returns the userId as a int.
     */
    public int getUserId()
    {
        return this.userId;
    }

    /**
     * Set the userId to the specified value.
     *
     * @param userId The userId to set.
     */
    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof User)
        {
            return equals((User)obj);
        }
        
        return false;
    }
    
    /**
     * Equals for User type.
     * 
     * @param obj the user to test
     * @return true if the User has identical values.
     */
    public boolean equals(User obj)
    {
        return getUserId() == obj.getUserId() && getPassWord() == obj.getPassWord() && getName().equals(obj.getName()) && getLoginCount() == obj.getLoginCount(); 
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        return getUserId();
    }
}
