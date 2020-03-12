/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ANeitherLessThanNorEqualToComparison extends PComparison
{
    private PComparison _comparison_;
    private TNeitherLessThanNorEqualTo _neitherLessThanNorEqualTo_;
    private PArithmetic _arithmetic_;

    public ANeitherLessThanNorEqualToComparison()
    {
        // Constructor
    }

    public ANeitherLessThanNorEqualToComparison(
        @SuppressWarnings("hiding") PComparison _comparison_,
        @SuppressWarnings("hiding") TNeitherLessThanNorEqualTo _neitherLessThanNorEqualTo_,
        @SuppressWarnings("hiding") PArithmetic _arithmetic_)
    {
        // Constructor
        setComparison(_comparison_);

        setNeitherLessThanNorEqualTo(_neitherLessThanNorEqualTo_);

        setArithmetic(_arithmetic_);

    }

    @Override
    public Object clone()
    {
        return new ANeitherLessThanNorEqualToComparison(
            cloneNode(this._comparison_),
            cloneNode(this._neitherLessThanNorEqualTo_),
            cloneNode(this._arithmetic_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANeitherLessThanNorEqualToComparison(this);
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

    public TNeitherLessThanNorEqualTo getNeitherLessThanNorEqualTo()
    {
        return this._neitherLessThanNorEqualTo_;
    }

    public void setNeitherLessThanNorEqualTo(TNeitherLessThanNorEqualTo node)
    {
        if(this._neitherLessThanNorEqualTo_ != null)
        {
            this._neitherLessThanNorEqualTo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._neitherLessThanNorEqualTo_ = node;
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
            + toString(this._neitherLessThanNorEqualTo_)
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

        if(this._neitherLessThanNorEqualTo_ == child)
        {
            this._neitherLessThanNorEqualTo_ = null;
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

        if(this._neitherLessThanNorEqualTo_ == oldChild)
        {
            setNeitherLessThanNorEqualTo((TNeitherLessThanNorEqualTo) newChild);
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