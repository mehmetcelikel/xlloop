/*******************************************************************************
 * This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Peter Smith
 *******************************************************************************/
package org.boris.expr;

public class ExprGreaterThanOrEqualTo extends AbstractComparisonOperator
{
    public ExprGreaterThanOrEqualTo(Expr lhs, Expr rhs) {
        super(ExprType.GreaterThanOrEqualTo, lhs, rhs);
    }

    public Expr evaluate() throws ExprException {
        return bool(compare() >= 0);
    }

    public String toString() {
        return lhs + ">=" + rhs;
    }
}