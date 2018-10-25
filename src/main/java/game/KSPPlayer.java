package game;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import jdk.nashorn.internal.ir.Block;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.Arrays;
import java.util.List;

public class KSPPlayer {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      JFrame f = new JFrame("KSP Player Control Panel");
      f.setSize(1080, 1080);
      f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      f.setLocation((screenSize.width - f.getWidth()) / 2, (screenSize.height - f.getHeight()) / 2);
      f.setVisible(true);
    });
  }

  private JFrame frame;

  private KSPPlayer(JFrame frame) {
    this.frame = frame;
  }
}