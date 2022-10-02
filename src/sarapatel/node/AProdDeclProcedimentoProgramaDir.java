/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AProdDeclProcedimentoProgramaDir extends PProgramaDir
{
    private PProdDeclProcedimento _prodDeclProcedimento_;

    public AProdDeclProcedimentoProgramaDir()
    {
        // Constructor
    }

    public AProdDeclProcedimentoProgramaDir(
        @SuppressWarnings("hiding") PProdDeclProcedimento _prodDeclProcedimento_)
    {
        // Constructor
        setProdDeclProcedimento(_prodDeclProcedimento_);

    }

    @Override
    public Object clone()
    {
        return new AProdDeclProcedimentoProgramaDir(
            cloneNode(this._prodDeclProcedimento_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProdDeclProcedimentoProgramaDir(this);
    }

    public PProdDeclProcedimento getProdDeclProcedimento()
    {
        return this._prodDeclProcedimento_;
    }

    public void setProdDeclProcedimento(PProdDeclProcedimento node)
    {
        if(this._prodDeclProcedimento_ != null)
        {
            this._prodDeclProcedimento_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._prodDeclProcedimento_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._prodDeclProcedimento_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._prodDeclProcedimento_ == child)
        {
            this._prodDeclProcedimento_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._prodDeclProcedimento_ == oldChild)
        {
            setProdDeclProcedimento((PProdDeclProcedimento) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}