/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AChamadaProcedimentoComandoComando extends PComando
{
    private PChamadaProcedimento _chamadaProcedimento_;
    private TPontoVirgula _pontoVirgula_;

    public AChamadaProcedimentoComandoComando()
    {
        // Constructor
    }

    public AChamadaProcedimentoComandoComando(
        @SuppressWarnings("hiding") PChamadaProcedimento _chamadaProcedimento_,
        @SuppressWarnings("hiding") TPontoVirgula _pontoVirgula_)
    {
        // Constructor
        setChamadaProcedimento(_chamadaProcedimento_);

        setPontoVirgula(_pontoVirgula_);

    }

    @Override
    public Object clone()
    {
        return new AChamadaProcedimentoComandoComando(
            cloneNode(this._chamadaProcedimento_),
            cloneNode(this._pontoVirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAChamadaProcedimentoComandoComando(this);
    }

    public PChamadaProcedimento getChamadaProcedimento()
    {
        return this._chamadaProcedimento_;
    }

    public void setChamadaProcedimento(PChamadaProcedimento node)
    {
        if(this._chamadaProcedimento_ != null)
        {
            this._chamadaProcedimento_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._chamadaProcedimento_ = node;
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
            + toString(this._chamadaProcedimento_)
            + toString(this._pontoVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._chamadaProcedimento_ == child)
        {
            this._chamadaProcedimento_ = null;
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
        if(this._chamadaProcedimento_ == oldChild)
        {
            setChamadaProcedimento((PChamadaProcedimento) newChild);
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