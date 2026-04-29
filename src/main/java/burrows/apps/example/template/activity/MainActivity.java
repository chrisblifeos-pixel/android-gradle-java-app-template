@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Linking the XML elements to Java variables
    final android.widget.EditText myInput = findViewById(R.id.myInput);
    android.widget.Button myButton = findViewById(R.id.myButton);

    // Telling the button what to do
    myButton.setOnClickListener(new android.view.View.OnClickListener() {
        @Override
        public void onClick(android.view.View v) {
            String text = myInput.getText().toString();
            // This creates a small pop-up message on your tablet
            android.widget.Toast.makeText(MainActivity.this, "You typed: " + text, android.widget.Toast.LENGTH_LONG).show();
        }
    });
}