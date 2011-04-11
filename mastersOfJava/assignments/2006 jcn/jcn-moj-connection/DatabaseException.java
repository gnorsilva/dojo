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
 * DatabaseExceptions are thrown when the database connection of the DAO fails.
 *
 * @version	$Id:$
 * @author		berkmope (c) 8-jul-2006, Sogeti B.V.
 */
public class DatabaseException extends RuntimeException
{
    /**
     * Constructor: create a new DatabaseException.
     *
     * @param message
     */
    public DatabaseException(String message)
    {
        super(message);
    }

    /**
     * Constructor: create a new DatabaseException.
     *
     * @param message
     * @param cause
     */
    public DatabaseException(String message, Throwable cause)
    {
        super(message, cause);
    }

    /**
     * Constructor: create a new DatabaseException.
     *
     * @param cause
     */
    public DatabaseException(Throwable cause)
    {
        super(cause);
    }
}
