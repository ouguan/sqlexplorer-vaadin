package org.jumpmind.symmetric.ui.sqlexplorer;

import com.vaadin.ui.Component;
import com.vaadin.ui.MenuBar;

public interface IContentTab extends Component {
    
    public void selected(MenuBar menuBar);
    
    public void unselected();
}