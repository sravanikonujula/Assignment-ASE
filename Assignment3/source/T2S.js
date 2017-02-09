/**
 * Created by sravani on 2/5/2017.
 */


function convertTextToSpeech(){
    var text=document.getElementById("text").value;
    var textToSpeechUrl='https://stream.watsonplatform.net/text-to-speech/api/v1/synthesize?username=617e1065-d65c-4831-985a-940c83dd7876&password=5GGTnpwBAjhk&text='+text;

    var audio="<video controls='' autoplay='' name='media'><source src='"+textToSpeechUrl+"' type='audio/ogg'></video>";
    document.getElementById("playAudio").innerHTML=audio;
}
