/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ASubsetOfSetComparison extends PSetComparison
{
    private PSetComparison _setComparison_;
    private TSubsetOf _subsetOf_;
    private PSetArithmetic _setArithmetic_;

    public ASubsetOfSetComparison()
    {
        // Constructor
    }

    public ASubsetOfSetComparison(
        @SuppressWarnings("hiding") PSetComparison _setComparison_,
        @SuppressWarnings("hiding") TSubsetOf _subsetOf_,
        @SuppressWarnings("hiding") PSetArithmetic _setArithmetic_)
    {
        // Constructor
        setSetComparison(_setComparison_);

        setSubsetOf(_subsetOf_);

        setSetArithmetic(_setArithmetic_);

    }

    @Override
    public Object clone()
    {
        return new ASubsetOfSetComparison(
            cloneNode(this._setComparison_),
            cloneNode(this._subsetOf_),
            cloneNode(this._setArithmetic_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASubsetOfSetComparison(this);
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

    public TSubsetOf getSubsetOf()
    {
        return this._subsetOf_;
    }

    public void setSubsetOf(TSubsetOf node)
    {
        if(this._subsetOf_ != null)
        {
            this._subsetOf_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._subsetOf_ = node;
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
            + toString(this._subsetOf_)
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

        if(this._subsetOf_ == child)
        {
            this._subsetOf_ = null;
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

        if(this._subsetOf_ == oldChild)
        {
            setSubsetOf((TSubsetOf) newChild);
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
