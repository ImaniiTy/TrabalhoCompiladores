/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AMaiorExp extends PExp
{
    private PExp _esquerda_;
    private PExp _direita_;

    public AMaiorExp()
    {
        // Constructor
    }

    public AMaiorExp(
        @SuppressWarnings("hiding") PExp _esquerda_,
        @SuppressWarnings("hiding") PExp _direita_)
    {
        // Constructor
        setEsquerda(_esquerda_);

        setDireita(_direita_);

    }

    @Override
    public Object clone()
    {
        return new AMaiorExp(
            cloneNode(this._esquerda_),
            cloneNode(this._direita_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMaiorExp(this);
    }

    public PExp getEsquerda()
    {
        return this._esquerda_;
    }

    public void setEsquerda(PExp node)
    {
        if(this._esquerda_ != null)
        {
            this._esquerda_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._esquerda_ = node;
    }

    public PExp getDireita()
    {
        return this._direita_;
    }

    public void setDireita(PExp node)
    {
        if(this._direita_ != null)
        {
            this._direita_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._direita_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._esquerda_)
            + toString(this._direita_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._esquerda_ == child)
        {
            this._esquerda_ = null;
            return;
        }

        if(this._direita_ == child)
        {
            this._direita_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._esquerda_ == oldChild)
        {
            setEsquerda((PExp) newChild);
            return;
        }

        if(this._direita_ == oldChild)
        {
            setDireita((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
