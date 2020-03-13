/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AFactorElementArithmetic extends PElementArithmetic
{
    private PElementFactor _elementFactor_;

    public AFactorElementArithmetic()
    {
        // Constructor
    }

    public AFactorElementArithmetic(
        @SuppressWarnings("hiding") PElementFactor _elementFactor_)
    {
        // Constructor
        setElementFactor(_elementFactor_);

    }

    @Override
    public Object clone()
    {
        return new AFactorElementArithmetic(
            cloneNode(this._elementFactor_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFactorElementArithmetic(this);
    }

    public PElementFactor getElementFactor()
    {
        return this._elementFactor_;
    }

    public void setElementFactor(PElementFactor node)
    {
        if(this._elementFactor_ != null)
        {
            this._elementFactor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elementFactor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._elementFactor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._elementFactor_ == child)
        {
            this._elementFactor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._elementFactor_ == oldChild)
        {
            setElementFactor((PElementFactor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
