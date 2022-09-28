/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AMaiorIgualPrio3 extends PPrio3
{
    private PPrio3 _prio3_;
    private TMaiorIgual _maiorIgual_;
    private PPrio4 _prio4_;

    public AMaiorIgualPrio3()
    {
        // Constructor
    }

    public AMaiorIgualPrio3(
        @SuppressWarnings("hiding") PPrio3 _prio3_,
        @SuppressWarnings("hiding") TMaiorIgual _maiorIgual_,
        @SuppressWarnings("hiding") PPrio4 _prio4_)
    {
        // Constructor
        setPrio3(_prio3_);

        setMaiorIgual(_maiorIgual_);

        setPrio4(_prio4_);

    }

    @Override
    public Object clone()
    {
        return new AMaiorIgualPrio3(
            cloneNode(this._prio3_),
            cloneNode(this._maiorIgual_),
            cloneNode(this._prio4_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMaiorIgualPrio3(this);
    }

    public PPrio3 getPrio3()
    {
        return this._prio3_;
    }

    public void setPrio3(PPrio3 node)
    {
        if(this._prio3_ != null)
        {
            this._prio3_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._prio3_ = node;
    }

    public TMaiorIgual getMaiorIgual()
    {
        return this._maiorIgual_;
    }

    public void setMaiorIgual(TMaiorIgual node)
    {
        if(this._maiorIgual_ != null)
        {
            this._maiorIgual_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._maiorIgual_ = node;
    }

    public PPrio4 getPrio4()
    {
        return this._prio4_;
    }

    public void setPrio4(PPrio4 node)
    {
        if(this._prio4_ != null)
        {
            this._prio4_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._prio4_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._prio3_)
            + toString(this._maiorIgual_)
            + toString(this._prio4_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._prio3_ == child)
        {
            this._prio3_ = null;
            return;
        }

        if(this._maiorIgual_ == child)
        {
            this._maiorIgual_ = null;
            return;
        }

        if(this._prio4_ == child)
        {
            this._prio4_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._prio3_ == oldChild)
        {
            setPrio3((PPrio3) newChild);
            return;
        }

        if(this._maiorIgual_ == oldChild)
        {
            setMaiorIgual((TMaiorIgual) newChild);
            return;
        }

        if(this._prio4_ == oldChild)
        {
            setPrio4((PPrio4) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}