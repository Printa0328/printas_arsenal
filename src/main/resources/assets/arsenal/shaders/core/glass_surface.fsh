#version 330 core

uniform sampler2D Sampler0;
uniform vec4 ColorModulator;
uniform float Alpha;
uniform float Emission;

in vec2 texCoord0;
in vec3 normal;
in vec3 fragPos;
in vec3 viewDir;

out vec4 fragColor;

void main() {
    vec4 baseColor = texture(Sampler0, texCoord0) * ColorModulator;
	
	// fresnel
    float fresnel = pow(1.0 - max(dot(normalize(normal), normalize(viewDir)), 0.0), 3.0);
    vec3 fresnelColor = vec3(0.6, 0.9, 1.0) * fresnel; // 푸른빛 윤곽
	
    // refraction
    float refraction = abs(dot(normalize(normal), vec3(0.5, 0.7, 0.3)));
    vec3 refractColor = mix(vec3(0.2,0.5,0.7), vec3(1.0,1.0,1.0), refraction);
	
    // finalColor
    vec3 finalColor = baseColor.rgb * refractColor + fresnelColor * Emission;

    fragColor = vec4(finalColor, baseColor.a * Alpha);
}