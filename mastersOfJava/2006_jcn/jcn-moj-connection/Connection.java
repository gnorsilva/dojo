/*
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
 * @author berkmope
 */
public interface Connection
{
    /**
     * Open a new connection.
     * 
     * @throws ConnectionException
     */
    public void open() throws ConnectionException;
    
    /**
     * Close the connection. Closing the connection will either physically
     * close the connection or make it available in the pool. Either way,
     * do not use a closed connection, as this may result in undefined behaviour.
     * 
     * Warning: the connection must be closed, otherwise not all system resources
     * will be released properly. Do not rely on the finalize and the
     * garbage collection, as these may not run before program termination.
     * 
     * @throws ConnectionException
     */
    public void close() throws ConnectionException;
    
    /**
     * Create a new {@link Statement}.
     * 
     * Note: only one statement per connection can be created at a time.
     * 
     * @param query 
     * @return a new Statement
     * @throws ConnectionException
     */
    public Statement createStatement(String query) throws ConnectionException;
}
