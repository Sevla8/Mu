/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ANotEqualToSetComparison extends PSetComparison
{
    private PSetComparison _setComparison_;
    private TNotEqualTo _notEqualTo_;
    private PSetArithmetic _setArithmetic_;

    public ANotEqualToSetComparison()
    {
        // Constructor
    }

    public ANotEqualToSetComparison(
        @SuppressWarnings("hiding") PSetComparison _setComparison_,
        @SuppressWarnings("hiding") TNotEqualTo _notEqualTo_,
        @SuppressWarnings("hiding") PSetArithmetic _setArithmetic_)
    {
        // Constructor
        setSetComparison(_setComparison_);

        setNotEqualTo(_notEqualTo_);

        setSetArithmetic(_setArithmetic_);

    }

    @Override
    public Object clone()
    {
        return new ANotEqualToSetComparison(
            cloneNode(this._setComparison_),
            cloneNode(this._notEqualTo_),
            cloneNode(this._setArithmetic_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANotEqualToSetComparison(this);
    }

    public PSetComparison getSetComparison()
    {
        return this._setComparison_;
    }

    public void setSetComparison(PSetComparison node)
    {
        if(this._setComparison_ != null)
        {
            this._setComparison_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._setComparison_ = node;
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

    public PSetArithmetic getSetArithmetic()
    {
        return this._setArithmetic_;
    }

    public void setSetArithmetic(PSetArithmetic node)
    {
        if(this._setArithmetic_ != null)
        {
            this._setArithmetic_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._setArithmetic_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._setComparison_)
            + toString(this._notEqualTo_)
            + toString(this._setArithmetic_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._setComparison_ == child)
        {
            this._setComparison_ = null;
            return;
        }

        if(this._notEqualTo_ == child)
        {
            this._notEqualTo_ = null;
            return;
        }

        if(this._setArithmetic_ == child)
        {
            this._setArithmetic_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._setComparison_ == oldChild)
        {
            setSetComparison((PSetComparison) newChild);
            return;
        }

        if(this._notEqualTo_ == oldChild)
        {
            setNotEqualTo((TNotEqualTo) newChild);
            return;
        }

        if(this._setArithmetic_ == oldChild)
        {
            setSetArithmetic((PSetArithmetic) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
