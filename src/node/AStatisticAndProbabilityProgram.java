/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AStatisticAndProbabilityProgram extends PProgram
{
    private TCategory _category_;
    private TStatisticAndProbability _statisticAndProbability_;
    private TSemicolon _semicolon_;

    public AStatisticAndProbabilityProgram()
    {
        // Constructor
    }

    public AStatisticAndProbabilityProgram(
        @SuppressWarnings("hiding") TCategory _category_,
        @SuppressWarnings("hiding") TStatisticAndProbability _statisticAndProbability_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setCategory(_category_);

        setStatisticAndProbability(_statisticAndProbability_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AStatisticAndProbabilityProgram(
            cloneNode(this._category_),
            cloneNode(this._statisticAndProbability_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStatisticAndProbabilityProgram(this);
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

    public TStatisticAndProbability getStatisticAndProbability()
    {
        return this._statisticAndProbability_;
    }

    public void setStatisticAndProbability(TStatisticAndProbability node)
    {
        if(this._statisticAndProbability_ != null)
        {
            this._statisticAndProbability_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._statisticAndProbability_ = node;
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
            + toString(this._category_)
            + toString(this._statisticAndProbability_)
            + toString(this._semicolon_);
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

        if(this._statisticAndProbability_ == child)
        {
            this._statisticAndProbability_ = null;
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
        if(this._category_ == oldChild)
        {
            setCategory((TCategory) newChild);
            return;
        }

        if(this._statisticAndProbability_ == oldChild)
        {
            setStatisticAndProbability((TStatisticAndProbability) newChild);
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