/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AExpSetExponent extends PSetExponent
{
    private PSetExponent _setExponent_;
    private TPower _power_;
    private PSetTerm _setTerm_;

    public AExpSetExponent()
    {
        // Constructor
    }

    public AExpSetExponent(
        @SuppressWarnings("hiding") PSetExponent _setExponent_,
        @SuppressWarnings("hiding") TPower _power_,
        @SuppressWarnings("hiding") PSetTerm _setTerm_)
    {
        // Constructor
        setSetExponent(_setExponent_);

        setPower(_power_);

        setSetTerm(_setTerm_);

    }

    @Override
    public Object clone()
    {
        return new AExpSetExponent(
            cloneNode(this._setExponent_),
            cloneNode(this._power_),
            cloneNode(this._setTerm_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpSetExponent(this);
    }

    public PSetExponent getSetExponent()
    {
        return this._setExponent_;
    }

    public void setSetExponent(PSetExponent node)
    {
        if(this._setExponent_ != null)
        {
            this._setExponent_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._setExponent_ = node;
    }

    public TPower getPower()
    {
        return this._power_;
    }

    public void setPower(TPower node)
    {
        if(this._power_ != null)
        {
            this._power_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._power_ = node;
    }

    public PSetTerm getSetTerm()
    {
        return this._setTerm_;
    }

    public void setSetTerm(PSetTerm node)
    {
        if(this._setTerm_ != null)
        {
            this._setTerm_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._setTerm_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._setExponent_)
            + toString(this._power_)
            + toString(this._setTerm_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._setExponent_ == child)
        {
            this._setExponent_ = null;
            return;
        }

        if(this._power_ == child)
        {
            this._power_ = null;
            return;
        }

        if(this._setTerm_ == child)
        {
            this._setTerm_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._setExponent_ == oldChild)
        {
            setSetExponent((PSetExponent) newChild);
            return;
        }

        if(this._power_ == oldChild)
        {
            setPower((TPower) newChild);
            return;
        }

        if(this._setTerm_ == oldChild)
        {
            setSetTerm((PSetTerm) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
