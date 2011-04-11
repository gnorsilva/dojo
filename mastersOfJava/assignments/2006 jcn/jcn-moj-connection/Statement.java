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
 * Statement that can be executed through a connection.
 *
 * @version	$Id:$
 * @author		berkmope (c) 8-jul-2006, Sogeti B.V.
 */
public interface Statement
{
    /**
     * Execute the statement.
     * 
     * @return the result of executing the statement.
     * @throws ConnectionException 
     */
    public ResultSet execute() throws ConnectionException;
    
    /**
     * Close the statement after processing the results.
     * Closing the statement will invalidate the {@link ResultSet}.
     * 
     * Note: closing the statement is optional. You may rely on the
     * connection to close the statement for you. However, you cannot
     * create a new statement until the current statement is closed.
     * 
     * @throws ConnectionException
     */
    public void closeStatement() throws ConnectionException;
}
