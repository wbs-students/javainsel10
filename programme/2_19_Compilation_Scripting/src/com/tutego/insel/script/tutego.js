f = new javax.swing.JFrame()
f.setSize( 500, 100 )
f.defaultCloseOperation = javax.swing.JFrame.EXIT_ON_CLOSE
f.title = "Hallo " + name + "."
f.visible = true
today = new Date()
println( today )
month = today.getMonth() + 1
