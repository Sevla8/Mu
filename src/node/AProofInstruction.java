/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AProofInstruction extends PProofInstruction
{
    private THashtag _hashtag_;
    private TNumber _number_;
    private TColumn _column_;
    private PDemonstration _demonstration_;
    private TDone _done_;
    private TSemicolon _semicolon_;

    public AProofInstruction()
    {
        // Constructor
    }

    public AProofInstruction(
        @SuppressWarnings("hiding") THashtag _hashtag_,
        @SuppressWarnings("hiding") TNumber _number_,
        @SuppressWarnings("hiding") TColumn _column_,
        @SuppressWarnings("hiding") PDemonstration _demonstration_,
        @SuppressWarnings("hiding") TDone _done_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setHashtag(_hashtag_);

        setNumber(_number_);

        setColumn(_column_);

        setDemonstration(_demonstration_);

        setDone(_done_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AProofInstruction(
            cloneNode(this._hashtag_),
            cloneNode(this._number_),
            cloneNode(this._column_),
            cloneNode(this._demonstration_),
            cloneNode(this._done_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProofInstruction(this);
    }

    public THashtag getHashtag()
    {
        return this._hashtag_;
    }

    public void setHashtag(THashtag node)
    {
        if(this._hashtag_ != null)
        {
            this._hashtag_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._hashtag_ = node;
    }

    public TNumber getNumber()
    {
        return this._number_;
    }

    public void setNumber(TNumber node)
    {
        if(this._number_ != null)
        {
            this._number_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._number_ = node;
    }

    public TColumn getColumn()
    {
        return this._column_;
    }

    public void setColumn(TColumn node)
    {
        if(this._column_ != null)
        {
            this._column_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._column_ = node;
    }

    public PDemonstration getDemonstration()
    {
        return this._demonstration_;
    }

    public void setDemonstration(PDemonstration node)
    {
        if(this._demonstration_ != null)
        {
            this._demonstration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._demonstration_ = node;
    }

    public TDone getDone()
    {
        return this._done_;
    }

    public void setDone(TDone node)
    {
        if(this._done_ != null)
        {
            this._done_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._done_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._hashtag_)
            + toString(this._number_)
            + toString(this._column_)
            + toString(this._demonstration_)
            + toString(this._done_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._hashtag_ == child)
        {
            this._hashtag_ = null;
            return;
        }

        if(this._number_ == child)
        {
            this._number_ = null;
            return;
        }

        if(this._column_ == child)
        {
            this._column_ = null;
            return;
        }

        if(this._demonstration_ == child)
        {
            this._demonstration_ = null;
            return;
        }

        if(this._done_ == child)
        {
            this._done_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._hashtag_ == oldChild)
        {
            setHashtag((THashtag) newChild);
            return;
        }

        if(this._number_ == oldChild)
        {
            setNumber((TNumber) newChild);
            return;
        }

        if(this._column_ == oldChild)
        {
            setColumn((TColumn) newChild);
            return;
        }

        if(this._demonstration_ == oldChild)
        {
            setDemonstration((PDemonstration) newChild);
            return;
        }

        if(this._done_ == oldChild)
        {
            setDone((TDone) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
