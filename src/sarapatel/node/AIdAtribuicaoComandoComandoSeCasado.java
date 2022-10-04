/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AIdAtribuicaoComandoComandoSeCasado extends PComandoSeCasado
{
    private PIdAtribuicao _idAtribuicao_;
    private TPontoVirgula _pontoVirgula_;

    public AIdAtribuicaoComandoComandoSeCasado()
    {
        // Constructor
    }

    public AIdAtribuicaoComandoComandoSeCasado(
        @SuppressWarnings("hiding") PIdAtribuicao _idAtribuicao_,
        @SuppressWarnings("hiding") TPontoVirgula _pontoVirgula_)
    {
        // Constructor
        setIdAtribuicao(_idAtribuicao_);

        setPontoVirgula(_pontoVirgula_);

    }

    @Override
    public Object clone()
    {
        return new AIdAtribuicaoComandoComandoSeCasado(
            cloneNode(this._idAtribuicao_),
            cloneNode(this._pontoVirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdAtribuicaoComandoComandoSeCasado(this);
    }

    public PIdAtribuicao getIdAtribuicao()
    {
        return this._idAtribuicao_;
    }

    public void setIdAtribuicao(PIdAtribuicao node)
    {
        if(this._idAtribuicao_ != null)
        {
            this._idAtribuicao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._idAtribuicao_ = node;
    }

    public TPontoVirgula getPontoVirgula()
    {
        return this._pontoVirgula_;
    }

    public void setPontoVirgula(TPontoVirgula node)
    {
        if(this._pontoVirgula_ != null)
        {
            this._pontoVirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontoVirgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._idAtribuicao_)
            + toString(this._pontoVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._idAtribuicao_ == child)
        {
            this._idAtribuicao_ = null;
            return;
        }

        if(this._pontoVirgula_ == child)
        {
            this._pontoVirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._idAtribuicao_ == oldChild)
        {
            setIdAtribuicao((PIdAtribuicao) newChild);
            return;
        }

        if(this._pontoVirgula_ == oldChild)
        {
            setPontoVirgula((TPontoVirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}