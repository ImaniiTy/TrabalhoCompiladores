/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AProdDeclFuncaoProgramaDir extends PProgramaDir
{
    private PProdDeclFuncao _prodDeclFuncao_;

    public AProdDeclFuncaoProgramaDir()
    {
        // Constructor
    }

    public AProdDeclFuncaoProgramaDir(
        @SuppressWarnings("hiding") PProdDeclFuncao _prodDeclFuncao_)
    {
        // Constructor
        setProdDeclFuncao(_prodDeclFuncao_);

    }

    @Override
    public Object clone()
    {
        return new AProdDeclFuncaoProgramaDir(
            cloneNode(this._prodDeclFuncao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProdDeclFuncaoProgramaDir(this);
    }

    public PProdDeclFuncao getProdDeclFuncao()
    {
        return this._prodDeclFuncao_;
    }

    public void setProdDeclFuncao(PProdDeclFuncao node)
    {
        if(this._prodDeclFuncao_ != null)
        {
            this._prodDeclFuncao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._prodDeclFuncao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._prodDeclFuncao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._prodDeclFuncao_ == child)
        {
            this._prodDeclFuncao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._prodDeclFuncao_ == oldChild)
        {
            setProdDeclFuncao((PProdDeclFuncao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
