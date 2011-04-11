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
 * Result of executing a {@link Statement}.
 *
 * @version	$Id:$
 * @author		berkmope (c) 8-jul-2006, Sogeti B.V.
 */
public interface ResultSet
{
    /**
     * Jump forward to the next result.
     * Do not jump beyond the last result, as this will result in an exception.
     * 
     * @throws ConnectionException
     */
    public void next() throws ConnectionException;
    
    /**
     * Check if there is a next result.
     * 
     * @return <code>true</code> if there is a next result.
     * @throws ConnectionException 
     */
    public boolean hasNext() throws ConnectionException;
    
    /**
     * Get the integer value associated with column index.
     * 
     * @param index
     * @return the integer value.
     * @throws ConnectionException 
     */
    public int getInt(int index) throws ConnectionException;
    
    /**
     * Get the String value associated with column index.
     * 
     * @param index
     * @return the String value.
     * @throws ConnectionException 
     */
    public String getString(int index) throws ConnectionException;
    
    /**
     * Get the Object associated with column index.
     * 
     * @param index
     * @return the Object.
     * @throws ConnectionException 
     */
    public Object getObject(int index) throws ConnectionException;
}
