/*------------------------------------------------------------------------------
 *     Ident: Delivery Center Java
 *    Author: berkmope
 * Copyright: (c) 9-jul-2006 Sogeti Nederland B.V. All Rights Reserved.
 *------------------------------------------------------------------------------
 * Sogeti Nederland B.V.    |  No part of this file may be reproduced or 
 * Divisie Managed Delivery |  transmitted in any form or by any means,        
 * Lange Dreef 17           |  electronic or mechanical, for the purpose,      
 * 4131 NJ VIANEN           |  without the express written permission of the   
 * The Netherlands          |  copyright holder.
 *------------------------------------------------------------------------------
 */

/**
 * DataSource to create and manage exceptions
 *
 * @version	$Id:$
 * @author		berkmope (c) 9-jul-2006, Sogeti B.V.
 */
public interface DataSource
{
    /**
     * Get a connection. This can be a new connection, if there's no
     * connection available from the pool, or a free connection from the
     * pool.
     * 
     * @return a new or available connection.
     */
    public Connection getConnection();
}
