/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AIdAtribuicaoIdAtribuicao extends PIdAtribuicao
{
    private PValor _valor_;
    private TAtribuicao _atribuicao_;
    private PExp _exp_;

    public AIdAtribuicaoIdAtribuicao()
    {
        // Constructor
    }

    public AIdAtribuicaoIdAtribuicao(
        @SuppressWarnings("hiding") PValor _valor_,
        @SuppressWarnings("hiding") TAtribuicao _atribuicao_,
        @SuppressWarnings("hiding") PExp _exp_)
    {
        // Constructor
        setValor(_valor_);

        setAtribuicao(_atribuicao_);

        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new AIdAtribuicaoIdAtribuicao(
            cloneNode(this._valor_),
            cloneNode(this._atribuicao_),
            cloneNode(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdAtribuicaoIdAtribuicao(this);
    }

    public PValor getValor()
    {
        return this._valor_;
    }

    public void setValor(PValor node)
    {
        if(this._valor_ != null)
        {
            this._valor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._valor_ = node;
    }

    public TAtribuicao getAtribuicao()
    {
        return this._atribuicao_;
    }

    public void setAtribuicao(TAtribuicao node)
    {
        if(this._atribuicao_ != null)
        {
            this._atribuicao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._atribuicao_ = node;
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._valor_)
            + toString(this._atribuicao_)
            + toString(this._exp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._valor_ == child)
        {
            this._valor_ = null;
            return;
        }

        if(this._atribuicao_ == child)
        {
            this._atribuicao_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._valor_ == oldChild)
        {
            setValor((PValor) newChild);
            return;
        }

        if(this._atribuicao_ == oldChild)
        {
            setAtribuicao((TAtribuicao) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
