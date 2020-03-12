/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AGreaterThanOrEqualToComparison extends PComparison
{
    private PComparison _comparison_;
    private TGreaterThanOrEqualTo _greaterThanOrEqualTo_;
    private PArithmetic _arithmetic_;

    public AGreaterThanOrEqualToComparison()
    {
        // Constructor
    }

    public AGreaterThanOrEqualToComparison(
        @SuppressWarnings("hiding") PComparison _comparison_,
        @SuppressWarnings("hiding") TGreaterThanOrEqualTo _greaterThanOrEqualTo_,
        @SuppressWarnings("hiding") PArithmetic _arithmetic_)
    {
        // Constructor
        setComparison(_comparison_);

        setGreaterThanOrEqualTo(_greaterThanOrEqualTo_);

        setArithmetic(_arithmetic_);

    }

    @Override
    public Object clone()
    {
        return new AGreaterThanOrEqualToComparison(
            cloneNode(this._comparison_),
            cloneNode(this._greaterThanOrEqualTo_),
            cloneNode(this._arithmetic_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGreaterThanOrEqualToComparison(this);
    }

    public PComparison getComparison()
    {
        return this._comparison_;
    }

    public void setComparison(PComparison node)
    {
        if(this._comparison_ != null)
        {
            this._comparison_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comparison_ = node;
    }

    public TGreaterThanOrEqualTo getGreaterThanOrEqualTo()
    {
        return this._greaterThanOrEqualTo_;
    }

    public void setGreaterThanOrEqualTo(TGreaterThanOrEqualTo node)
    {
        if(this._greaterThanOrEqualTo_ != null)
        {
            this._greaterThanOrEqualTo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._greaterThanOrEqualTo_ = node;
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
            + toString(this._comparison_)
            + toString(this._greaterThanOrEqualTo_)
            + toString(this._arithmetic_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comparison_ == child)
        {
            this._comparison_ = null;
            return;
        }

        if(this._greaterThanOrEqualTo_ == child)
        {
            this._greaterThanOrEqualTo_ = null;
            return;
        }

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
        if(this._comparison_ == oldChild)
        {
            setComparison((PComparison) newChild);
            return;
        }

        if(this._greaterThanOrEqualTo_ == oldChild)
        {
            setGreaterThanOrEqualTo((TGreaterThanOrEqualTo) newChild);
            return;
        }

        if(this._arithmetic_ == oldChild)
        {
            setArithmetic((PArithmetic) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
