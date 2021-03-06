/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AComparisonElementExpression extends PElementExpression
{
    private PElementComparison _elementComparison_;

    public AComparisonElementExpression()
    {
        // Constructor
    }

    public AComparisonElementExpression(
        @SuppressWarnings("hiding") PElementComparison _elementComparison_)
    {
        // Constructor
        setElementComparison(_elementComparison_);

    }

    @Override
    public Object clone()
    {
        return new AComparisonElementExpression(
            cloneNode(this._elementComparison_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComparisonElementExpression(this);
    }

    public PElementComparison getElementComparison()
    {
        return this._elementComparison_;
    }

    public void setElementComparison(PElementComparison node)
    {
        if(this._elementComparison_ != null)
        {
            this._elementComparison_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elementComparison_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._elementComparison_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._elementComparison_ == child)
        {
            this._elementComparison_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._elementComparison_ == oldChild)
        {
            setElementComparison((PElementComparison) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
