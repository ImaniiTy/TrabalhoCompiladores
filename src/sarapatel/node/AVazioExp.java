/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AVazioExp extends PExp
{

    public AVazioExp()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new AVazioExp();
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVazioExp(this);
    }

    @Override
    public String toString()
    {
        return "";
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        throw new RuntimeException("Not a child.");
    }
}
