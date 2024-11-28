import { useStompClient } from "react-stomp-hooks";
import React from "react";

const PublishMessage = () => {
  const stompClient = useStompClient();

  const publishMessage = () => {
    if (stompClient) {
      stompClient.publish({ destination: "/app/broadcast", body: "Hello World" });
    }
  };
  return <button onClick={publishMessage}> Send message </button>;
};

export default PublishMessage;
