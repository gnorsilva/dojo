/*------------------------------------------------------------------------------
 *     Ident: Delivery Center Java
 *    Author: berkmope
 * Copyright: (c) 23-aug-2006 Sogeti Nederland B.V. All Rights Reserved.
 *------------------------------------------------------------------------------
 * Sogeti Nederland B.V.    |  No part of this file may be reproduced or 
 * Divisie Managed Delivery |  transmitted in any form or by any means,        
 * Lange Dreef 17           |  electronic or mechanical, for the purpose,      
 * 4131 NJ VIANEN           |  without the express written permission of the   
 * The Netherlands          |  copyright holder.
 *------------------------------------------------------------------------------
 */

import java.util.Map;

/**
 * This replacer does a lookup in a map, to replace
 * matching text with the value of the key-value pair.
 * If no match is found, the empty string is used to
 * do the replacement. 
 *
 * @version $Id:$
 * @author      berkmope (c) 23-aug-2006, Sogeti B.V.
 */
public class LookupReplacer implements ReplacerInterface
{
    private Map database;

    /**
     * Constructor: create a new LookupReplacer.
     *
     */
    public LookupReplacer()
    {
        super();
    }

    /* (non-Javadoc)
     * @see ReplacerInterface#setRegularExpression(java.lang.String)
     */
    public void setRegularExpression(String regex)
    {
        // TODO Set the regular expression
    }

    /**
     * Get the database.
     *
     * @return Returns the database as a Map.
     */
    public Map getDatabase()
    {
        return this.database;
    }

    /**
     * Set the database to the specified value.
     *
     * @param database The database to set.
     */
    public void setDatabase(Map database)
    {
        this.database = database;
    }

    /* (non-Javadoc)
     * @see ReplacerInterface#replace(java.lang.String)
     */
    public String replace(String input)
    {
        // TODO Implement the replacer
        return null;
    }

    private String findReplacement(String key)
    {
        String result = (String) getDatabase().get(key);
        
        if (result == null)
        {
            result = "";
        }
        
        return result;
    }
}
