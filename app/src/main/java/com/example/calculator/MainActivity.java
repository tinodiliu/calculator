package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.math.BigDecimal;
import java.util.Stack;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView() {
        Button zero = (Button) findViewById(R.id.zero);
        Button one=(Button) findViewById(R.id.one);
        Button two=(Button) findViewById(R.id.two);
        Button three=(Button) findViewById(R.id.three);
        Button four=(Button) findViewById(R.id.four);
        Button five=(Button) findViewById(R.id.five);
        Button six=(Button) findViewById(R.id.six);
        Button seven=(Button) findViewById(R.id.seven);
        Button eight=(Button) findViewById(R.id.eight);
        Button nine=(Button) findViewById(R.id.nine);
        Button dot=(Button) findViewById(R.id.dot);
        Button equal=(Button) findViewById(R.id.equal);
        Button add=(Button) findViewById(R.id.add);
        Button subtract=(Button) findViewById(R.id.subtract);
        Button multiply=(Button) findViewById(R.id.multiply);
        Button divide=(Button) findViewById(R.id.divide);
        Button percent=(Button) findViewById(R.id.percent);
        Button fushu=(Button) findViewById(R.id.fushu);
        Button kaifang=(Button) findViewById(R.id.kaifang);
        Button pi=(Button) findViewById(R.id.pi);
        Button left_bracket=(Button) findViewById(R.id.left_bracket);
        Button right_bracket=(Button) findViewById(R.id.right_bracket);
        Button pingfang=(Button) findViewById(R.id.pingfang);
        Button sin=(Button) findViewById(R.id.sin);
        Button cos=(Button) findViewById(R.id.cos);
        Button tan=(Button) findViewById(R.id.tan);
        Button del=(Button) findViewById(R.id.del);
        Button clear=(Button) findViewById(R.id.clear);
        text=(TextView) findViewById(R.id.text);

        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        dot.setOnClickListener(this);
        equal.setOnClickListener(this);
        add.setOnClickListener(this);
        subtract.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        percent.setOnClickListener(this);
        fushu.setOnClickListener(this);
        kaifang.setOnClickListener(this);
        pi.setOnClickListener(this);
        pingfang.setOnClickListener(this);
        left_bracket.setOnClickListener(this);
        right_bracket.setOnClickListener(this);
        sin.setOnClickListener(this);
        cos.setOnClickListener(this);
        tan.setOnClickListener(this);
        del.setOnClickListener(this);
        clear.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        String str=text.getText().toString();
        switch (view.getId()){
            case R.id.del:
                if(str.length()>1){
                    str=str.substring(0,str.length()-1);
                }
                else{
                    str="0";
                }
                text.setText(str);
                break;
            case R.id.clear:
                str="0";
                text.setText(str);
                break;
            case R.id.zero:
                if (str.equals("0")){
                    str="0";
                }
                else if(str.charAt(str.length()-1)=='π'||str.charAt(str.length()-1)=='%'||str.charAt(str.length()-1)=='┌'||str.charAt(str.length()-1)=='s'||str.charAt(str.length()-1)=='c'||str.charAt(str.length()-1)=='t'){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else{
                    str+="0";
                }
                text.setText(str);
                break;
            case R.id.one:
                if (str.equals("0")){
                    str="1";
                }
                else if(str.charAt(str.length()-1)=='π'||str.charAt(str.length()-1)=='%'||str.charAt(str.length()-1)=='┌'||str.charAt(str.length()-1)=='s'||str.charAt(str.length()-1)=='c'||str.charAt(str.length()-1)=='t'){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else{
                    str+="1";
                }
                text.setText(str);
                break;
            case R.id.two:
                if (str.equals("0")){
                    str="2";
                }
                else if(str.charAt(str.length()-1)=='π'||str.charAt(str.length()-1)=='%'||str.charAt(str.length()-1)=='┌'||str.charAt(str.length()-1)=='s'||str.charAt(str.length()-1)=='c'||str.charAt(str.length()-1)=='t'){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else{
                    str+="2";
                }
                text.setText(str);
                break;
            case R.id.three:
                if (str.equals("0")){
                    str="3";
                }
                else if(str.charAt(str.length()-1)=='π'||str.charAt(str.length()-1)=='%'||str.charAt(str.length()-1)=='┌'||str.charAt(str.length()-1)=='s'||str.charAt(str.length()-1)=='c'||str.charAt(str.length()-1)=='t'){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else{
                    str+="3";
                }
                text.setText(str);
                break;
            case R.id.four:
                if (str.equals("0")){
                    str="4";
                }
                else if(str.charAt(str.length()-1)=='π'||str.charAt(str.length()-1)=='%'||str.charAt(str.length()-1)=='┌'||str.charAt(str.length()-1)=='s'||str.charAt(str.length()-1)=='c'||str.charAt(str.length()-1)=='t'){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else{
                    str+="4";
                }
                text.setText(str);
                break;
            case R.id.five:
                if (str.equals("0")){
                    str="5";
                }
                else if(str.charAt(str.length()-1)=='π'||str.charAt(str.length()-1)=='%'||str.charAt(str.length()-1)=='┌'||str.charAt(str.length()-1)=='s'||str.charAt(str.length()-1)=='c'||str.charAt(str.length()-1)=='t'){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else{
                    str+="5";
                }
                text.setText(str);
                break;
            case R.id.six:
                if (str.equals("0")){
                    str="6";
                }
                else if(str.charAt(str.length()-1)=='π'||str.charAt(str.length()-1)=='%'||str.charAt(str.length()-1)=='┌'||str.charAt(str.length()-1)=='s'||str.charAt(str.length()-1)=='c'||str.charAt(str.length()-1)=='t'){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else{
                    str+="6";
                }
                text.setText(str);
                break;
            case R.id.seven:
                if (str.equals("0")){
                    str="7";
                }
                else if(str.charAt(str.length()-1)=='π'||str.charAt(str.length()-1)=='%'||str.charAt(str.length()-1)=='┌'||str.charAt(str.length()-1)=='s'||str.charAt(str.length()-1)=='c'||str.charAt(str.length()-1)=='t'){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else{
                    str+="7";
                }
                text.setText(str);
                break;
            case R.id.eight:
                if (str.equals("0")){
                    str="8";
                }
                else if(str.charAt(str.length()-1)=='π'||str.charAt(str.length()-1)=='%'||str.charAt(str.length()-1)=='┌'||str.charAt(str.length()-1)=='s'||str.charAt(str.length()-1)=='c'||str.charAt(str.length()-1)=='t'){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else{
                    str+="8";
                }
                text.setText(str);
                break;
            case R.id.nine:
                if (str.equals("0")){
                    str="9";
                }
                else if(str.charAt(str.length()-1)=='π'||str.charAt(str.length()-1)=='%'||str.charAt(str.length()-1)=='┌'||str.charAt(str.length()-1)=='s'||str.charAt(str.length()-1)=='c'||str.charAt(str.length()-1)=='t'){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else{
                    str+="9";
                }
                text.setText(str);
                break;
            case R.id.dot:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'||str.charAt(str.length()-1)=='^'||str.charAt(str.length()-1)=='('||str.charAt(str.length()-1)==')'){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else if(str.charAt(str.length()-1)=='π'||str.charAt(str.length()-1)=='%'||str.charAt(str.length()-1)=='┌'||str.charAt(str.length()-1)=='s'||str.charAt(str.length()-1)=='c'||str.charAt(str.length()-1)=='t'){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else{
                    str+=".";
                    text.setText(str);
                }
                break;
            case R.id.add:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'||str.charAt(str.length()-1)=='^'||str.charAt(str.length()-1)=='('){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else{
                    if(str.equals("0")){
                        Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        str += "+";
                        text.setText(str);
                    }
                }
                break;
            case R.id.subtract:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'||str.charAt(str.length()-1)=='^'){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    if(str.equals("0")){
                        text.setText("-");
                    }
                    else {
                        str += "-";
                        text.setText(str);
                    }
                }
                break;
            case R.id.multiply:
                if(str.charAt(str.length()-1)=='%'||str.charAt(str.length()-1)=='π'||str.charAt(str.length()-1)=='s'||str.charAt(str.length()-1)=='c'||str.charAt(str.length()-1)=='t'||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'||str.charAt(str.length()-1)=='^'||str.charAt(str.length()-1)=='('){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    if(str.equals("0")){
                        Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        str += "×";
                        text.setText(str);
                    }
                }
                break;
            case R.id.divide:
                if(str.charAt(str.length()-1)=='π'||str.charAt(str.length()-1)=='%'||str.charAt(str.length()-1)=='┌'||str.charAt(str.length()-1)=='s'||str.charAt(str.length()-1)=='c'||str.charAt(str.length()-1)=='t'||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'||str.charAt(str.length()-1)=='^'||str.charAt(str.length()-1)=='('){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    if(str.equals("0")){
                        Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        str += "÷";
                        text.setText(str);
                    }
                }
                break;
            case R.id.left_bracket:
                if (str.length()==1&&str.equals("0")){
                    str="(";
                }
                else if(!str.contains("+")&&!str.contains("-")&&!str.contains("×")&&!str.contains("÷")){
                    str="("+str;
                }
                else if((str.charAt(str.length()-1)>='0'&&str.charAt(str.length()-1)<='9')||str.charAt(str.length()-1)=='π'||str.charAt(str.length()-1)=='%'||str.charAt(str.length()-1)=='┌'||str.charAt(str.length()-1)=='s'||str.charAt(str.length()-1)=='c'||str.charAt(str.length()-1)=='t'){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                }
                else {
                    str += "(";
                }
                text.setText(str);
                break;
            case R.id.right_bracket:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'||str.charAt(str.length()-1)=='^'||str.charAt(str.length()-1)=='('){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else if (str.length()==1){
                    str="0";
                }
                else {
                    str += ")";
                }
                text.setText(str);
                break;
            case R.id.equal:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='^'){
                    Toast.makeText(MainActivity.this,"表达式不完整",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    String ero = isMatched(str);
                    if (ero.equals("no error")) {
                        String re = getResult();
                        if (re.contains("Infinity")) {
                            Toast.makeText(MainActivity.this, "0不能做除数", Toast.LENGTH_SHORT).show();
                            text.setText(str);
                        }
                        else {
                            text.setText(re);
                        }
                    }
                    else {
                        Toast.makeText(MainActivity.this, ero, Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            case R.id.kaifang:
                if(str.charAt(str.length()-1)=='π'||str.charAt(str.length()-1)=='%'||str.charAt(str.length()-1)=='┌'||str.charAt(str.length()-1)=='s'||str.charAt(str.length()-1)=='c'||str.charAt(str.length()-1)=='t'||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'||str.charAt(str.length()-1)=='^'||str.charAt(str.length()-1)=='('||str.charAt(str.length()-1)==')'){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    if(str.equals("0")){
                        Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        str += "┌";
                        text.setText(str);
                    }
                }
                break;
            case R.id.pingfang:
                if(str.charAt(str.length()-1)=='π'||str.charAt(str.length()-1)=='%'||str.charAt(str.length()-1)=='┌'||str.charAt(str.length()-1)=='s'||str.charAt(str.length()-1)=='c'||str.charAt(str.length()-1)=='t'||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'||str.charAt(str.length()-1)=='^'||str.charAt(str.length()-1)=='('){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    if(str.equals("0")){
                        Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        str += "^";
                        text.setText(str);
                    }
                }
                break;
            case R.id.pi:
                if(str.charAt(str.length()-1)=='π'||str.charAt(str.length()-1)=='%'||str.charAt(str.length()-1)=='┌'||str.charAt(str.length()-1)=='s'||str.charAt(str.length()-1)=='c'||str.charAt(str.length()-1)=='t'||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'||str.charAt(str.length()-1)=='^'||str.charAt(str.length()-1)=='('){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    if(str.equals("0")){
                        Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        str += "π";
                        text.setText(str);
                    }
                }
                break;
            case R.id.percent:
                if(str.charAt(str.length()-1)=='π'||str.charAt(str.length()-1)=='%'||str.charAt(str.length()-1)=='┌'||str.charAt(str.length()-1)=='s'||str.charAt(str.length()-1)=='c'||str.charAt(str.length()-1)=='t'||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'||str.charAt(str.length()-1)=='^'||str.charAt(str.length()-1)=='('){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    if(str.equals("0")){
                        Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        str += "%";
                        text.setText(str);
                    }
                }
                break;
            case R.id.sin:
                if(str.charAt(str.length()-1)=='π'||str.charAt(str.length()-1)=='%'||str.charAt(str.length()-1)=='┌'||str.charAt(str.length()-1)=='s'||str.charAt(str.length()-1)=='c'||str.charAt(str.length()-1)=='t'||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'||str.charAt(str.length()-1)=='^'||str.charAt(str.length()-1)=='('){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    if(str.equals("0")){
                        Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        str += "s";
                        text.setText(str);
                    }
                }
                break;
            case R.id.cos:
                if(str.charAt(str.length()-1)=='π'||str.charAt(str.length()-1)=='%'||str.charAt(str.length()-1)=='┌'||str.charAt(str.length()-1)=='s'||str.charAt(str.length()-1)=='c'||str.charAt(str.length()-1)=='t'||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'||str.charAt(str.length()-1)=='^'||str.charAt(str.length()-1)=='('){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    if(str.equals("0")){
                        Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        str += "c";
                        text.setText(str);
                    }
                }
                break;
            case R.id.tan:
                if(str.charAt(str.length()-1)=='π'||str.charAt(str.length()-1)=='%'||str.charAt(str.length()-1)=='┌'||str.charAt(str.length()-1)=='s'||str.charAt(str.length()-1)=='c'||str.charAt(str.length()-1)=='t'||str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'||str.charAt(str.length()-1)=='^'||str.charAt(str.length()-1)=='('){
                    Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    if(str.equals("0")){
                        Toast.makeText(MainActivity.this,"Input error!",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        str += "t";
                        text.setText(str);
                    }
                }
                break;
            case R.id.fushu:
                if(str.charAt(0)>='0'&&str.charAt(0)<='9'){
                    if(str.equals("0")){
                        text.setText("0");
                    }
                    else{
                        text.setText("-"+str);
                    }
                }
                else if(str.charAt(0)=='-')
                    text.setText(str.substring(1,str.length()));
                else
                    text.setText(str);
                break;
            default:
                break;
        }
    }

    //将中缀表达式转换成后缀表达式
    public static StringBuffer toPostfix(String infix){
        Stack<String> stack=new Stack<String>();   //运算符栈,顺序栈
        StringBuffer postfix=new StringBuffer(infix.length()*2);   //后缀表达式字符串
        int i=0;
        postfix.append(0);
        postfix.append(" ");
        while(i<infix.length()){
            char ch=infix.charAt(i);
                switch (ch) {
                    case '+':
                    case '-':
                        while (!stack.isEmpty() && !stack.peek().equals("(")) //如果栈不为空且栈顶元素不是"(",则出栈
                            postfix.append(stack.pop());   //且添加到后缀表达式串
                        stack.push(ch + ""); //ch入栈
                        i++;
                        break;
                    case '×':
                    case '÷':
                    case '^':
                        while (!stack.isEmpty() && (stack.peek().equals("×")||stack.peek().equals("÷")||stack.peek().equals("^")) ) //如果栈顶元素不为空且栈顶元素是"*""/""^"时,则出栈
                            postfix.append(stack.pop());
                        stack.push(ch + "");
                        i++;
                        break;
                    case '%':
                    case 'π':
                    case '┌':
                    case 's':
                    case 'c':
                    case 't':
                        while (!stack.isEmpty() && (stack.peek().equals("c")||stack.peek().equals("s")||stack.peek().equals("t")||stack.peek().equals("┌")|| stack.peek().equals("%")|| stack.peek().equals("π")))  //如果栈顶元素不为空且栈顶元素是...时,则出栈
                            postfix.append(stack.pop());
                        stack.push(ch + "");
                        postfix.append(1);
                        postfix.append(" ");
                        i++;
                        break;
                    case '(':
                        if(infix.charAt(i+1)=='-') {
                            postfix.append(0);
                            postfix.append(" ");
                            stack.push(ch + ""); //直接入栈
                        }
                        else{
                            stack.push(ch + ""); //直接入栈
                        }
                        i++;
                        break;
                    case ')':
                        String out = stack.pop();
                        while (out != null && !out.equals("(")) {    //如果栈顶元素不为空且不为"("时
                            postfix.append(out);   //添加到后缀表达式串
                            out = stack.pop();   //把此时位于栈顶的"("弹出
                        }
                        i++;
                        break;
                    default:
                        while ((i < infix.length() && ch >= '0' && ch <= '9') || (i < infix.length() && ch == '.')) {
                            postfix.append(ch);    //如果是数字直接添加到后缀表达式串
                            i++;
                            if (i < infix.length())
                                ch = infix.charAt(i);
                        }
                        postfix.append(" ");
                }

        }
        while(!stack.isEmpty())       //所有运算符出栈
            postfix.append(stack.pop());   //添加到后缀表达式中
        return postfix;
    }

    //计算后缀表达式
    public static Double toValue(StringBuffer postfix){
        Stack<Double> stack=new Stack<Double>();   //操作数栈,链式栈
        double value=0;
        int j=0;
        for(int i=0;i<postfix.length();i++){
            j=i;
            char ch=postfix.charAt(i);
            if ((ch>='0'&&ch<='9')||ch=='.') {
                value=0;
                while(ch!=' '){
                    while(ch!=' '&&ch!='.'){
                        value=value*10+ch-'0';
                        j++;
                        ch=postfix.charAt(++i);
                    }
                    if(ch=='.')
                        ch=postfix.charAt(++i);
                    while(ch!=' '&&(i>=j+1)){
                        BigDecimal valueBD=new BigDecimal(Double.toString(value));
                        BigDecimal chBD=new BigDecimal(Double.toString(ch-'0'));
                        BigDecimal nBD=new BigDecimal(Double.toString(Math.pow(10,i-j)));
                        double temp=chBD.divide(nBD).doubleValue();
                        BigDecimal tempBD=new BigDecimal(Double.toString(temp));
                        value=valueBD.add(tempBD).doubleValue();
                        ch=postfix.charAt(++i);
                    }
                    stack.push(value);
                }
            }
            else{
                if(ch!=' '){
                    Double y=stack.pop();
                    Double x=stack.pop();
                    switch(ch){
                        case'+':
                            value=x+y;
                            break;
                        case'-':
                            value=x-y;
                            break;
                        case'×':
                            value=x*y;
                            break;
                        case'÷':
                            value=x/y;
                            break;
                        case'%':
                            value=x/100;
                            break;
                        case'π':
                            value=x*Math.PI;
                            break;
                        case'^':
                            value=Math.pow(x,y);
                            break;
                        case'┌':
                            value=Math.sqrt(x);
                            break;
                        case 's':
                            value=Math.sin(x);
                            break;
                        case 'c':
                            value=Math.cos(x);
                            break;
                        case 't':
                            value=Math.tan(x);
                            break;
                    }
                    stack.push(value);
                }
            }
        }
        return stack.pop();
    }

    public String getResult(){
        String infix = text.getText().toString();
        StringBuffer postfix=toPostfix(infix);
        Double result=toValue(postfix);
        String re=String.format("%.9f",result);//规避极小误差
        re = re.replaceAll("0+?$", "");//去掉多余的0
        re = re.replaceAll("[.]$", "");//如最后一位是.则去掉
        return re;
    }

    public static String isMatched(String infix){
        Stack<String> stack=new Stack<String>();
        for (int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            switch(ch){
                case'(':
                    stack.push(ch+"");
                    break;
                case')':
                    if(stack.isEmpty()||!stack.pop().equals("("))
                        return "缺少 (";
            }
        }
        return(stack.isEmpty())?"no error":"缺少 )";
    }
}
