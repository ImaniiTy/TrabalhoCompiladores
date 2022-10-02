/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ATernarioTernario extends PTernario
{
    private TCmdSe _cmdSe_;
    private TParEsq _parEsq_;
    private PExp _expCond_;
    private TParDir _parDir_;

    public ATernarioTernario()
    {
        // Constructor
    }

    public ATernarioTernario(
        @SuppressWarnings("hiding") TCmdSe _cmdSe_,
        @SuppressWarnings("hiding") TParEsq _parEsq_,
        @SuppressWarnings("hiding") PExp _expCond_,
        @SuppressWarnings("hiding") TParDir _parDir_)
    {
        // Constructor
        setCmdSe(_cmdSe_);

        setParEsq(_parEsq_);

        setExpCond(_expCond_);

        setParDir(_parDir_);

    }

    @Override
    public Object clone()
    {
        return new ATernarioTernario(
            cloneNode(this._cmdSe_),
            cloneNode(this._parEsq_),
            cloneNode(this._expCond_),
            cloneNode(this._parDir_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATernarioTernario(this);
    }

    public TCmdSe getCmdSe()
    {
        return this._cmdSe_;
    }

    public void setCmdSe(TCmdSe node)
    {
        if(this._cmdSe_ != null)
        {
            this._cmdSe_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cmdSe_ = node;
    }

    public TParEsq getParEsq()
    {
        return this._parEsq_;
    }

    public void setParEsq(TParEsq node)
    {
        if(this._parEsq_ != null)
        {
            this._parEsq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parEsq_ = node;
    }

    public PExp getExpCond()
    {
        return this._expCond_;
    }

    public void setExpCond(PExp node)
    {
        if(this._expCond_ != null)
        {
            this._expCond_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expCond_ = node;
    }

    public TParDir getParDir()
    {
        return this._parDir_;
    }

    public void setParDir(TParDir node)
    {
        if(this._parDir_ != null)
        {
            this._parDir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parDir_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._cmdSe_)
            + toString(this._parEsq_)
            + toString(this._expCond_)
            + toString(this._parDir_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._cmdSe_ == child)
        {
            this._cmdSe_ = null;
            return;
        }

        if(this._parEsq_ == child)
        {
            this._parEsq_ = null;
            return;
        }

        if(this._expCond_ == child)
        {
            this._expCond_ = null;
            return;
        }

        if(this._parDir_ == child)
        {
            this._parDir_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._cmdSe_ == oldChild)
        {
            setCmdSe((TCmdSe) newChild);
            return;
        }

        if(this._parEsq_ == oldChild)
        {
            setParEsq((TParEsq) newChild);
            return;
        }

        if(this._expCond_ == oldChild)
        {
            setExpCond((PExp) newChild);
            return;
        }

        if(this._parDir_ == oldChild)
        {
            setParDir((TParDir) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
