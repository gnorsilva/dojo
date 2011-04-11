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
 * ConnectionException is the root for all exception occuring in a connection.
 *
 * @version	$Id:$
 * @author		berkmope (c) 8-jul-2006, Sogeti B.V.
 */
public class ConnectionException extends Exception
{
    /**
     * Constructor: create a new ConnectionException.
     *
     */
    public ConnectionException()
    {
        super();
    }

    /**
     * Constructor: create a new ConnectionException.
     *
     * @param message
     */
    public ConnectionException(String message)
    {
        super(message);
    }

    /**
     * Constructor: create a new ConnectionException.
     *
     * @param message
     * @param cause
     */
    public ConnectionException(String message, Throwable cause)
    {
        super(message, cause);
    }

    /**
     * Constructor: create a new ConnectionException.
     *
     * @param cause
     */
    public ConnectionException(Throwable cause)
    {
        super(cause);
    }

}
