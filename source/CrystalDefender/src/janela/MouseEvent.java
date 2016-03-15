package janela;

import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.TransferHandler;

public class MouseEvent implements MouseListener {

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		JComponent jc = (JComponent) e.getSource();
		TransferHandler th = jc.getTransferHandler();
		th.exportAsDrag(jc, e, TransferHandler.COPY);
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {

	}

}
