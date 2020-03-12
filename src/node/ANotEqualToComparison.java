/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ANotEqualToComparison extends PComparison
{
    private PComparison _comparison_;
    private TNotEqualTo _notEqualTo_;
    private PArithmetic _arithmetic_;

    public ANotEqualToComparison()
    {
        // Constructor
    }

    public ANotEqualToComparison(
        @SuppressWarnings("hiding") PComparison _comparison_,
        @SuppressWarnings("hiding") TNotEqualTo _notEqualTo_,
        @SuppressWarnings("hiding") PArithmetic _arithmetic_)
    {
        // Constructor
        setComparison(_comparison_);

        setNotEqualTo(_notEqualTo_);

        setArithmetic(_arithmetic_);

    }

    @Override
    public Object clone()
    {
        return new ANotEqualToComparison(
            cloneNode(this._comparison_),
            cloneNode(this._notEqualTo_),
            cloneNode(this._arithmetic_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANotEqualToComparison(this);
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

    public TNotEqualTo getNotEqualTo()
    {
        return this._notEqualTo_;
    }

    public void setNotEqualTo(TNotEqualTo node)
    {
        if(this._notEqualTo_ != null)
        {
            this._notEqualTo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._notEqualTo_ = node;
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
            + toString(this._notEqualTo_)
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

        if(this._notEqualTo_ == child)
        {
            this._notEqualTo_ = null;
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

        if(this._notEqualTo_ == oldChild)
        {
            setNotEqualTo((TNotEqualTo) newChild);
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
