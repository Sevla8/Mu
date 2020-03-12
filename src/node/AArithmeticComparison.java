/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AArithmeticComparison extends PComparison
{
    private PArithmetic _arithmetic_;

    public AArithmeticComparison()
    {
        // Constructor
    }

    public AArithmeticComparison(
        @SuppressWarnings("hiding") PArithmetic _arithmetic_)
    {
        // Constructor
        setArithmetic(_arithmetic_);

    }

    @Override
    public Object clone()
    {
        return new AArithmeticComparison(
            cloneNode(this._arithmetic_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArithmeticComparison(this);
    }

    public PArithmetic getArithmetic()
    {
        return this._arithmetic_;
    }

    public void setArithmetic(PArithmetic node)
    {
        if(this._arithmetic_ != null)
        {
            this._arithmetic_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._arithmetic_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._arithmetic_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._arithmetic_ == child)
        {
            this._arithmetic_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._arithmetic_ == oldChild)
        {
            setArithmetic((PArithmetic) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
