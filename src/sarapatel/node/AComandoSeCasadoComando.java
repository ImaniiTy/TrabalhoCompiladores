/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AComandoSeCasadoComando extends PComando
{
    private PComandoSeCasado _comandoSeCasado_;

    public AComandoSeCasadoComando()
    {
        // Constructor
    }

    public AComandoSeCasadoComando(
        @SuppressWarnings("hiding") PComandoSeCasado _comandoSeCasado_)
    {
        // Constructor
        setComandoSeCasado(_comandoSeCasado_);

    }

    @Override
    public Object clone()
    {
        return new AComandoSeCasadoComando(
            cloneNode(this._comandoSeCasado_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComandoSeCasadoComando(this);
    }

    public PComandoSeCasado getComandoSeCasado()
    {
        return this._comandoSeCasado_;
    }

    public void setComandoSeCasado(PComandoSeCasado node)
    {
        if(this._comandoSeCasado_ != null)
        {
            this._comandoSeCasado_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandoSeCasado_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comandoSeCasado_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comandoSeCasado_ == child)
        {
            this._comandoSeCasado_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comandoSeCasado_ == oldChild)
        {
            setComandoSeCasado((PComandoSeCasado) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
