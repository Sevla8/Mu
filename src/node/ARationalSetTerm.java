/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ARationalSetTerm extends PSetTerm
{
    private TRational _rational_;

    public ARationalSetTerm()
    {
        // Constructor
    }

    public ARationalSetTerm(
        @SuppressWarnings("hiding") TRational _rational_)
    {
        // Constructor
        setRational(_rational_);

    }

    @Override
    public Object clone()
    {
        return new ARationalSetTerm(
            cloneNode(this._rational_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARationalSetTerm(this);
    }

    public TRational getRational()
    {
        return this._rational_;
    }

    public void setRational(TRational node)
    {
        if(this._rational_ != null)
        {
            this._rational_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rational_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._rational_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._rational_ == child)
        {
            this._rational_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._rational_ == oldChild)
        {
            setRational((TRational) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
