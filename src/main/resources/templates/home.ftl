<!DOCTYPE HTML>
<html>
<head>

<script type="text/javascript">
    let globalWs = null;
         function startWebSocket()
         {
            if ("WebSocket" in window)
            {
               // 打开一个 web socket
               var ws = new WebSocket("ws://localhost:10000/coding");
                
               ws.onopen = function()
               {
                  // Web Socket 已连接上，使用 send() 方法发送数据
                  ws.send("发送数据");
               };
                
               ws.onmessage = function (evt) 
               { 
                  var receivedMsg = evt.data;
                  console.log("收到信息："+receivedMsg);
               };
                
               ws.onclose = function()
               { 
                  // 关闭 websocket
                  alert("连接已关闭..."); 
               };
               
               globalWs = ws;
            }
            
            else
            {
               // 浏览器不支持 WebSocket
               alert("您的浏览器不支持 WebSocket!");
            }
         }
         
         function sendMessage(){
            if(globalWs){
                let text = document.getElementById("message").value;
                console.log("sendMessage",text);
                globalWs.send(text);
            }else{
                alert("请先开启websocket");
            }
         }
      </script>
      
      
</head>
<body>
    <input id="message" type="text" name="message" />
    <input type="button" onclick="sendMessage()" value="提交" />
    
    <script type="text/javascript">
        startWebSocket()
    </script>
</body>
</html>