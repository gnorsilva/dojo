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

/**
 * A Replacer allows the replacement of patterns in strings
 * using a regular expression. Implementing replacers have
 * their own rules as to what the matching texts are replaced
 * by.
 *
 * @version	$Id:$
 * @author		berkmope (c) 23-aug-2006, Sogeti B.V.
 */
public interface ReplacerInterface
{
    /**
     * Set the regular expression for this replacer.
     * 
     * @param regex the regex to set.
     */
    public void setRegularExpression(String regex);
    
    /**
     * Replace the matching text occarding to the rules
     * of this replacer.
     * 
     * @param input the input string.
     * @return the result of replacing the matching text
     *     in the input.
     */
    public String replace(String input);
}
