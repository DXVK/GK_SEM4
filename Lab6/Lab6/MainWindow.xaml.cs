using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace Lab6
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }
        int x = 1;
        private void Button_Click(object sender, RoutedEventArgs e)
        {
            
            stakPanel.Children.Add(new Label()
            {
                Content = "Label" + x

            }) ;
            x++;
        }

        int y = 2;
        private void Button_Click_1(object sender, RoutedEventArgs e)
        {
            wrapPanel.Children.Add(new Button()

            {
                Content = "Button" + y
            });
                y++;
        }
    }
}
