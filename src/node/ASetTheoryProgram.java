/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ASetTheoryProgram extends PProgram
{
    private TCategory _category_;
    private TSetTheory _setTheory_;
    private TSemicolon _semicolon_;
    private PInstructions _instructions_;

    public ASetTheoryProgram()
    {
        // Constructor
    }

    public ASetTheoryProgram(
        @SuppressWarnings("hiding") TCategory _category_,
        @SuppressWarnings("hiding") TSetTheory _setTheory_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_,
        @SuppressWarnings("hiding") PInstructions _instructions_)
    {
        // Constructor
        setCategory(_category_);

        setSetTheory(_setTheory_);

        setSemicolon(_semicolon_);

        setInstructions(_instructions_);

    }

    @Override
    public Object clone()
    {
        return new ASetTheoryProgram(
            cloneNode(this._category_),
            cloneNode(this._setTheory_),
            cloneNode(this._semicolon_),
            cloneNode(this._instructions_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASetTheoryProgram(this);
    }

    public TCategory getCategory()
    {
        return this._category_;
    }

    public void setCategory(TCategory node)
    {
        if(this._category_ != null)
        {
            this._category_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._category_ = node;
    }

    public TSetTheory getSetTheory()
    {
        return this._setTheory_;
    }

    public void setSetTheory(TSetTheory node)
    {
        if(this._setTheory_ != null)
        {
            this._setTheory_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._setTheory_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    public PInstructions getInstructions()
    {
        return this._instructions_;
    }

    public void setInstructions(PInstructions node)
    {
        if(this._instructions_ != null)
        {
            this._instructions_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._instructions_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._category_)
            + toString(this._setTheory_)
            + toString(this._semicolon_)
            + toString(this._instructions_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._category_ == child)
        {
            this._category_ = null;
            return;
        }

        if(this._setTheory_ == child)
        {
            this._setTheory_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        if(this._instructions_ == child)
        {
            this._instructions_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._category_ == oldChild)
        {
            setCategory((TCategory) newChild);
            return;
        }

        if(this._setTheory_ == oldChild)
        {
            setSetTheory((TSetTheory) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        if(this._instructions_ == oldChild)
        {
            setInstructions((PInstructions) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
