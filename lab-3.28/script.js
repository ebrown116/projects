function isStrongPassword(pass) {
    let mybool = true;
    let mybool2 = false;
    if (pass.length <8){
        mybool = false;
    }
    if (pass.indexOf("password") != -1){
        mybool=false;
    }
    for(let i=0; i<(pass.length); i++){
        if(pass.charCodeAt(i) <=90 && pass.charCodeAt(i) >= 65){
            mybool2=true;
        }
    }
    if (mybool2 === false){
        mybool = false;
    }

    return mybool;
}