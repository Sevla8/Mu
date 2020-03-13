/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ANotASupersetOfSetComparison extends PSetComparison
{
    private PSetComparison _setComparison_;
    private TNotASupersetOf _notASupersetOf_;
    private PSetArithmetic _setArithmetic_;

    public ANotASupersetOfSetComparison()
    {
        // Constructor
    }

    public ANotASupersetOfSetComparison(
        @SuppressWarnings("hiding") PSetComparison _setComparison_,
        @SuppressWarnings("hiding") TNotASupersetOf _notASupersetOf_,
        @SuppressWarnings("hiding") PSetArithmetic _setArithmetic_)
    {
        // Constructor
        setSetComparison(_setComparison_);

        setNotASupersetOf(_notASupersetOf_);

        setSetArithmetic(_setArithmetic_);

    }

    @Override
    public Object clone()
    {
        return new ANotASupersetOfSetComparison(
            cloneNode(this._setComparison_),
            cloneNode(this._notASupersetOf_),
            cloneNode(this._setArithmetic_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANotASupersetOfSetComparison(this);
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

    public TNotASupersetOf getNotASupersetOf()
    {
        return this._notASupersetOf_;
    }

    public void setNotASupersetOf(TNotASupersetOf node)
    {
        if(this._notASupersetOf_ != null)
        {
            this._notASupersetOf_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._notASupersetOf_ = node;
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
            + toString(this._notASupersetOf_)
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

        if(this._notASupersetOf_ == child)
        {
            this._notASupersetOf_ = null;
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

        if(this._notASupersetOf_ == oldChild)
        {
            setNotASupersetOf((TNotASupersetOf) newChild);
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
